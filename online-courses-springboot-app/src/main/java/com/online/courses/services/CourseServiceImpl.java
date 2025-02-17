package com.online.courses.services;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

import com.online.courses.dto.CourseMstDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.courses.dao.CourseDao;
import com.online.courses.dto.AddCourseRequest;
import com.online.courses.dto.CourseFormBean;
import com.online.courses.dto.CoursesDetailFormBean;
import com.online.courses.exceptions.CourseNotFoundException;
import com.online.courses.exceptions.IncorrectDataException;
import com.online.courses.models.CourseDtl;
import com.online.courses.models.CourseMst;
import com.online.courses.models.InstructorDtl;
import com.online.courses.models.InstructorMst;
import com.online.courses.repo.CourseDtlRepo;
import com.online.courses.repo.CourseMstRepo;
import com.online.courses.repo.InstructorDtlRepo;
import com.online.courses.repo.InstructorMstRepo;
import com.online.courses.utils.CourseUtils;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMstRepo courseMstRepo;
	
	@Autowired
	private CourseDtlRepo courseDtlRepo;
	
	@Autowired
    private CourseDao courseDao;
	
	@Autowired
	private InstructorMstRepo instructorMstRepo;
	
	@Autowired
	private InstructorDtlRepo instructorDtlRepo;
	/*
	@Override
	public List<CourseMst> getCourses() {
		return courseMstRepo.findAll();	
	}
	*/
	
	@Override
    public List<CourseMstDto> getCourses(int pageNo, int pageSize) throws Exception {

		/*
	    CoursesDetailFormBean coursesDetailFormBean = new CoursesDetailFormBean();
	    coursesDetailFormBean.setPageNo(pageNo);
	    coursesDetailFormBean.setPageSize(pageSize);    
        List<CoursesDetailFormBean> coursesDetailList = courseDao.getCourses(coursesDetailFormBean);
        int totalCourses = courseDao.getTotalCourses(coursesDetailFormBean);
        coursesDetailFormBean.setCoursesDetailList(coursesDetailList);
        coursesDetailFormBean.setTotalCourses(totalCourses);
        */

		// Create Pagable interface
		Pageable pageable = PageRequest.of(pageNo, pageSize);

		Page<CourseMst> coursePage= courseMstRepo.findAll(pageable);

		// get content from Page Object
		List<CourseMst> coursesLst = coursePage.getContent();

		// convert list of Course Entity to Course DTO
		return coursesLst.stream().map(course -> mapToCourseDto(course)).collect(Collectors.toList());
        // return coursesDetailFormBean;
    }

	// convert Course Entity to DTO
	private CourseMstDto mapToCourseDto(CourseMst courseMst){

		CourseMstDto courseMstDto = new CourseMstDto();

		courseMstDto.setCourseMstId(courseMst.getCourseMstId());
		courseMstDto.setActiveFlag(courseMst.getActiveFlag());
		courseMstDto.setInstructorMstId(courseMst.getInstructorMstId());

		return courseMstDto;
	}

	// convert Course DTO to Entity
	private CourseMst mapToCourseEntity(CourseMstDto courseMstDto){

		CourseMst courseMst = new CourseMst();

		courseMst.setCourseMstId(courseMstDto.getCourseMstId());
		courseMst.setActiveFlag(courseMstDto.getActiveFlag());
		courseMst.setInstructorMstId(courseMstDto.getInstructorMstId());

		return courseMst;
	}

	@Override
	public CoursesDetailFormBean getCourse(long courseId) throws Exception{
		
	    /* 
	    Optional<CourseMst> courseMst = courseMstRepo.findById(courseId);
	    if(!courseMst.isPresent()) {
	        throw new CourseNotFoundException("Course with courseId: "+courseId+" not found.");
	    }
	    */
	    
	    // BeanUtils.copyProperties(course, course);
	    
	    CoursesDetailFormBean coursesDetailFormBean = new CoursesDetailFormBean();
        coursesDetailFormBean.setCourseMstId(courseId);
	    List<CoursesDetailFormBean> courses = null;
        try {
            courses = courseDao.getCourses(coursesDetailFormBean);
            if(courses==null || courses.isEmpty()) {
                throw new CourseNotFoundException("Course with courseId: "+courseId+" not found.");
            }
        } catch (Exception e) {
            throw e;
        }
	    
		return courses.get(0);
	}



	@Override
	@Transactional
	public AddCourseRequest addNewCourse(AddCourseRequest addCourseRequest) {
	    
	    CourseMst courseMst = new CourseMst();
	    CourseDtl courseDtl = new CourseDtl();
	    InstructorMst instructorMst = new InstructorMst();
	    InstructorDtl instructorDtl = new InstructorDtl();
	    
	    if(addCourseRequest.isNewInstructorFlag()) {
	        instructorMst.setActiveFlag(1L);
	        instructorMst = instructorMstRepo.save(instructorMst);
	        instructorDtl = addCourseRequest.getInstructorDtl();
	        instructorDtl.setInstructorMstId(instructorMst.getInstructorMstId());
	        instructorDtl.setActiveFlag(1L);
	        if(!CourseUtils.validateInstructorEmail(instructorDtl.getEmail())) {
	            throw new IncorrectDataException("Instructor email id: "+instructorDtl.getEmail()+" has improper format.");
	        }
	        instructorDtl = instructorDtlRepo.save(instructorDtl);
	    }else {
	        instructorDtl = addCourseRequest.getInstructorDtl();
	    }
	    
	    courseMst.setInstructorMstId(instructorDtl.getInstructorMstId());
	    courseMst.setActiveFlag(1L);
	    
	    courseMst = courseMstRepo.save(courseMst);
	    courseDtl = addCourseRequest.getCourseDtl();
	    courseDtl.setCourseMstId(courseMst.getCourseMstId());
	    courseDtl.setActiveFlag(1L);
	    courseDtl = courseDtlRepo.save(courseDtl);	
		
		return addCourseRequest;
	}

}
