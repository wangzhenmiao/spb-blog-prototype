package com.wangzhen.spbblogprototype.repository;

import com.wangzhen.spbblogprototype.domain.User;
import org.springframework.data.repository.CrudRepository;
/**
 * @ClassName UserRepository
 * @Description
 * @Author wangzhen
 * @Date 2018/11/10 下午4:27
 **/
public interface UserRepository extends CrudRepository<User,Long> {
}
