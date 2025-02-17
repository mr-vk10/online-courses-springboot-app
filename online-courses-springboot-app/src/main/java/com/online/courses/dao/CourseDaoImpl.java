package com.online.courses.dao;

import java.math.BigInteger;
import java.util.List;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import com.online.courses.dto.CoursesDetailFormBean;

@Repository
public class CourseDaoImpl implements CourseDao {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<CoursesDetailFormBean> getCourses(CoursesDetailFormBean coursesDetailFormBean) throws Exception {
        
        List<CoursesDetailFormBean> courses = null;
        try {
            
            StringBuilder query = new StringBuilder();
            
            query.append("SELECT ");
            query.append("courseDtl.COURSE_DTL_ID as courseDtlId, ");
            query.append("courseDtl.TITLE as title, ");
            query.append("courseDtl.COURSE_DESC as courseDesc, ");
            query.append("courseDtl.DURATION as duration, ");
            query.append("courseDtl.NO_OF_LEC as noOfLec, ");
            query.append("courseDtl.LEVEL as level, ");
            query.append("case when courseDtl.LEVEL = 1 then 'Beginner' when courseDtl.LEVEL = 2 then 'Intermediate' when courseDtl.LEVEL = 3 then 'All Level' end as levelStr, ");
            query.append("courseDtl.PRICE as price, ");
            query.append("instructorDtl.INSTRUCTOR_DTL_ID as instructorDtlId, ");
            query.append("instructorDtl.INSTRUCTOR_MST_ID as instructorMstId, ");
            query.append("instructorDtl.FIRST_NAME as firstName, ");
            query.append("instructorDtl.LAST_NAME as lastName ");
            query.append("FROM COURSE_MST courseMst  ");
            query.append("join COURSE_DTL courseDtl on courseDtl.COURSE_MST_ID = courseMst.COURSE_MST_ID ");
            query.append("join INSTRUCTOR_MST instructorMst on instructorMst.INSTRUCTOR_MST_ID = courseMst.INSTRUCTOR_MST_ID ");
            query.append("join INSTRUCTOR_DTL instructorDtl on instructorDtl.INSTRUCTOR_MST_ID = instructorMst.INSTRUCTOR_MST_ID ");
            query.append("where 1=1");
            query.append(" AND courseMst.ACTIVE_FLAG = 1 ");
            query.append(" AND courseDtl.ACTIVE_FLAG = 1 ");
            query.append(" AND instructorMst.ACTIVE_FLAG = 1 ");
            query.append(" AND instructorDtl.ACTIVE_FLAG = 1 ");
            
            if(coursesDetailFormBean.getCourseMstId()!=null) {
                query.append(" AND courseMst.COURSE_MST_ID = :courseMstId ");
            }
            
            Query execQuery = entityManager.createNativeQuery(query.toString());
            
            if(coursesDetailFormBean.getCourseMstId()!=null) {
                execQuery.setParameter("courseMstId", coursesDetailFormBean.getCourseMstId());
            }
            
            if(coursesDetailFormBean.getPageNo().compareTo(BigInteger.ZERO) > 0) {
            	execQuery.setFirstResult(coursesDetailFormBean.getPageNo().multiply(coursesDetailFormBean.getPageSize()).intValue());
                execQuery.setMaxResults(coursesDetailFormBean.getPageSize().intValue());
            }
            
            courses = execQuery.unwrap(NativeQuery.class)
                               .addScalar("courseDtlId", StandardBasicTypes.LONG)
                               .addScalar("title", StandardBasicTypes.STRING)
                               .addScalar("courseDesc", StandardBasicTypes.STRING)
                               .addScalar("duration", StandardBasicTypes.LONG)
                               .addScalar("noOfLec", StandardBasicTypes.LONG)
                               .addScalar("level", StandardBasicTypes.LONG)
                               .addScalar("levelStr", StandardBasicTypes.STRING)
                               .addScalar("price", StandardBasicTypes.LONG)
                               .addScalar("instructorDtlId", StandardBasicTypes.LONG)
                               .addScalar("instructorMstId", StandardBasicTypes.LONG)
                               .addScalar("firstName", StandardBasicTypes.STRING)
                               .addScalar("lastName", StandardBasicTypes.STRING)
                               .setResultTransformer(Transformers.aliasToBean(CoursesDetailFormBean.class))
                               .getResultList();
            
        }catch(Exception e) {
            throw e;
        }
        
        return courses;
    }

	@Override
	public int getTotalCourses(CoursesDetailFormBean coursesDetailFormBean) throws Exception {
        
        int totalCourses = 0;
        try {
            
            StringBuilder query = new StringBuilder();
            
            query.append("SELECT ");
            query.append("COUNT(*) as totalCourses FROM COURSE_MST courseMst ");
            query.append("where 1=1");
            query.append(" AND courseMst.ACTIVE_FLAG = 1 ");
            
            if(coursesDetailFormBean.getCourseMstId()!=null) {
                query.append(" AND courseMst.COURSE_MST_ID = :courseMstId ");
            }
            
            Query execQuery = entityManager.createNativeQuery(query.toString());
            
            if(coursesDetailFormBean.getCourseMstId()!=null) {
                execQuery.setParameter("courseMstId", coursesDetailFormBean.getCourseMstId());
            }
                        
            totalCourses = ((Integer)execQuery.getSingleResult()).intValue();
            
        }catch(Exception e) {
            throw e;
        }
        
        return totalCourses;
    }

}
