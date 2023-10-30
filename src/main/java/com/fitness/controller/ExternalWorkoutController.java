package com.fitness.controller;


import com.fitness.service.WorkoutQueryBuilderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
public class ExternalWorkoutController {

    @Autowired
    private WorkoutQueryBuilderService workoutQueryBuilderService;

    @GetMapping("/workout/bodyPart")
    public void getWorkoutsPerBodyPart(@RequestParam(value = "bodyPart", required = false) String bodyPart) throws IOException, InterruptedException {
        System.out.println(workoutQueryBuilderService.buildWorkoutPerBodyPartURL(bodyPart).body());
    }

    @GetMapping("/workout/exercises")
    public void getExercisesPage() throws IOException, InterruptedException {
        System.out.println(workoutQueryBuilderService.buildExercisesURL().body());
    }

    @GetMapping("/workout/test")
    public void test() throws IOException, InterruptedException {
        System.out.println(workoutQueryBuilderService.testNewApi().body());
    }
}
