package mw.base.mybatis.dao.mapper;

import mw.base.mybatis.dao.model.TUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.Reader;
import java.util.Date;

/**
 * Created by mengwei on 2018/3/30.
 */
public class TUserMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            TUserMapper tUserMapper = sqlSession.getMapper(TUserMapper.class);
            TUser tUser = tUserMapper.selectByPrimaryKey(1);
            Assert.assertNotNull(tUser);
            Assert.assertEquals("admin",tUser.getUserName());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testInsert(){
        TUser user = new TUser();
        user.setUserName("PM");
//        user.setCredits(10);
        user.setLastIp("127.0.0.1");
        user.setLastVisit(new Date());
        user.setPassword("45678");

        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            TUserMapper tUserMapper = sqlSession.getMapper(TUserMapper.class);
            int result = tUserMapper.insertSelective(user);
            Assert.assertEquals(1,result);
            Assert.assertEquals(new Integer(7),user.getUserId());
        }finally {
//            sqlSession.commit();
            sqlSession.close();
        }
    }


}