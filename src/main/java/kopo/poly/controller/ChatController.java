//package kopo.poly.controller;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.xml.ws.Response;
//import java.util.List;
//
//
//@Slf4j
//@RestController
//@RequestMapping("/chat")
//@RequiredArgsConstructor
//public class ChatController {
//
//    private final IChatService chatService;
//
//    @PostMapping("chatAddProc")
//    public ResponseEntity<Integer> chatAddProc(@RequestBody ChatDTO chatDTO) throws Exception {
//
//        log.info(this.getClass().getName() + "채팅방 생성 시작!");
//        log.info("roomName : " + chatDTO.getRoomName());
//
//        int res = chatService.createChatRoom(chatDTO.getRoomName());
//
//        return ResponseEntity.ok().body(res);
//    }
//
//    public ResponseEntity<List<Integer>> chat() throws Exception {
//        log.info(this.getClass().getName() + "채팅방 리스트 가져오기 시작");
//
//        List<String> roomList = chatService.getChatRoomInfo();
//
//        log.info(this.getClass().getName() + "채팅방 리스트 가져오기 종료");
//
//        return ResponseEntity.ok().body(roomList);
//    }
//
//}
