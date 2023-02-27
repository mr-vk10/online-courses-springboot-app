package com.online.courses.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import com.online.courses.dto.ReviewFormBean;

@Repository
public class ReviewDaoImpl implements ReviewDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<ReviewFormBean> fetchStudentReviews (long studentId) throws Exception{
		List<ReviewFormBean> reviews = new ArrayList<ReviewFormBean>();
		try {
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT  ");
			query.append(" reviewMst.REVIEW_MST_ID as reviewMstId, ");
			query.append(" reviewMst.COMMENT as comment, ");
			query.append(" studentMst.STUDENT_MST_ID as studentMstId, ");
			query.append(" studentMst.EMAIL as email, ");
			query.append(" studentMst.FIRST_NAME as firstName, ");
			query.append(" studentMst.LAST_NAME as lastName ");
			query.append(" FROM REVIEW_MST reviewMst ");
			query.append(" join STUDENT_MST StudentMst on studentMst.STUDENT_MST_ID = reviewMst.STUDENT_MST_ID ");
			query.append(" where  studentMst.STUDENT_MST_ID =:studentMstId ");
			
			Query execQuery = entityManager.createNativeQuery(query.toString());
			
			execQuery.setParameter("studentMstId", studentId);
			
			// execQuery.addScaler("reviewMstId", StandardBasicTypes.LONG);
			
			// List<ReviewFormBean> reviews = execQuery.unwrap(org.hibernate.query.Query.class).getResultList();	
			
			reviews = execQuery.unwrap(NativeQuery.class)
								.addScalar("reviewMstId",StandardBasicTypes.LONG)
								.addScalar("comment",StandardBasicTypes.STRING)
								.addScalar("studentMstId",StandardBasicTypes.LONG)
								.addScalar("email",StandardBasicTypes.STRING)
								.addScalar("firstName",StandardBasicTypes.STRING)
								.addScalar("lastName",StandardBasicTypes.STRING)
								.setResultTransformer(Transformers.aliasToBean(ReviewFormBean.class))
								.getResultList();
		}catch(Exception e) {
			throw e;
		}
		
		return reviews;
	}
	
	

}
