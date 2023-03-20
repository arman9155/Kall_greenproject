package com.project.kall.service;


import com.project.kall.entity.OrderEntity;
import com.project.kall.entity.UserEntity;
import com.project.kall.repository.OrderRepository;
import com.project.kall.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MileageService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepository orderRepository;

//    public String[] List(String id) { //userId
//        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);
//        if(optionalUserEntity.isPresent()) {
//            UserEntity userEntity = optionalUserEntity.get();
//            // userEntity 구하구
//           String sum = String.valueOf(userEntity.getMileage());  //최종 마일리지

//            String[] mileageList = new String[];
//            List<OrderEntity> orderEntityList = orderRepository.findOrderId(id);
//            for(OrderEntity orderEntity : orderEntityList) {
//                String date = String.valueOf(orderEntity.getDate());
//                String use = String.valueOf(orderEntity.getMileage());
//                String get = String.valueOf(orderEntity.getGetMileage();
//                mileageList.add({date, use get, sum});
//            }
//
//
//
//        }
//    }
}
