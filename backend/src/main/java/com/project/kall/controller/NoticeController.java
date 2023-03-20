package com.project.kall.controller;

import com.project.kall.dto.NoticeDTO;
import com.project.kall.dto.ProductQDTO;
import com.project.kall.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoticeController {

    //
    @Autowired
    NoticeService noticeService;

// --------- 전체 Notice 리스트 뽑기------------------------------------------------------------------------------------
    @GetMapping("/notices/all")
    public List<NoticeDTO> allDTOList() {
        return noticeService.allNoticeList();
    }

// --------- 전체 Notice 에서 개별 뽑기------------------------------------------------------------------------------------
    @GetMapping("/notices/all/{id}")
    public NoticeDTO allDTOSelect(@PathVariable Integer id) {
        return noticeService.allNoticeSelect(id);
    }

// --------- 전체에서 notice만 리스트 뽑기 ---------------------------------------------------------------------------------
    @GetMapping("/notices")
    public List<NoticeDTO> noticeDTOList() {
        return noticeService.NoticeList();
    }

// --------- notice 개별 리스트 뽑기 ------------------------------------------------------------------------------------
    @GetMapping("/notices/{id}")
    public NoticeDTO noticeDTOSelect(@PathVariable Integer id) {
        return noticeService.NoticeSelect(id);
    }

 // --------- 전체에서 faq만 리스트 뽑기 -----------------------------------------------------------------------------------
    @GetMapping("/notices/faqs")
    public List<NoticeDTO> faqsDTOList() {
        return noticeService.faqList();
    }

// --------- faq 개별 리스트 뽑기 ------------------------------------------------------------------------------------
    @GetMapping("/notices/faqs/{id}")
    public NoticeDTO faqsDTOSelect(@PathVariable Integer id) {
        return noticeService.faqSelect(id);
    }

// ----------------------- 관리자 -----------------------------------------------------------------------------

    // --------- 공지글 추가 ------------------------------------------------------------------------------------
    @PostMapping("/admin/notices")
    public void noticeinsert(@RequestBody NoticeDTO noticeDTO) {
        noticeService.Noticeinsert(noticeDTO);
    }

    // --------- 공지글 수정 ------------------------------------------------------------------------------------
    @PutMapping("/admin/notices/{id}")
    public NoticeDTO noticeupdate(@RequestBody NoticeDTO noticeDTO, @PathVariable Integer id) {
        System.out.println("dto"+noticeDTO);
        System.out.println(id);
        return noticeService.Noticeupdate(id, noticeDTO);
    }

    // --------- 공지글 삭제 ------------------------------------------------------------------------------------
    @DeleteMapping("/admin/notices/{id}")
    public void noticedelete(@PathVariable Integer id) {
        noticeService.Noticedelete(id);
    }

    // --------- 공지글 삭제 (일괄) ------------------------------------------------------------------------------------

    @DeleteMapping("/admin/notices") // 다중 삭제 배열 noticeId
    public void deletes(@RequestBody Integer[] list) {
        noticeService.deletes(list);

    }
}

