package com.example.coursclassroomexam.Controllers;


import com.example.coursclassroomexam.Entities.*;
import com.example.coursclassroomexam.Serv.Serv;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exam")
public class CcController {
    private final Serv serv;


}
