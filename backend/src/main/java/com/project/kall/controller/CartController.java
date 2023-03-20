package com.project.kall.controller;


import com.project.kall.dto.CartDTO;
import com.project.kall.service.CartService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostRemove;
import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    CartService cartService;

//    -----------------------------------userId 별 카트 목록 --------------------------------------------------------
    @GetMapping("/user/{userId}") //id=user_id
    public List<CartDTO> cartList(@PathVariable String userId) {
        return cartService.cartList(userId);
    }

    @PostMapping("")
    public List<CartDTO> Add(@RequestBody List<CartDTO> cartDTOList) {
        return cartService.cartAdd(cartDTOList);
    }

    @DeleteMapping("")
    public void deleteCart(@RequestBody Integer[] ids) {
        cartService.deleteCart(ids);
    }

}
