package com.fitness.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ExecutedExercise {

    @Id
    @Column(name = "recent_exercise_id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Column(name = "duration", nullable = false)
    private int duration;

    @Column(name = "burnedCalories")
    private int burnedCalories;

    @Column
    private int sets;

    @Column
    private int repetitions;

    @Column
    private double appliedWeight;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client activeUser;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise finishedExercise;

    public ExecutedExercise(){

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public Exercise getFinishedExercise() {
        return finishedExercise;
    }

    public void setFinishedExercise(Exercise finishedExercise) {
        this.finishedExercise = finishedExercise;
    }

    public int getBurnedCalories() {
        return burnedCalories;
    }

    public void setBurnedCalories(int burnedCalories) {
        this.burnedCalories = burnedCalories;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public double getAppliedWeight() {
        return appliedWeight;
    }

    public void setAppliedWeight(double appliedWeight) {
        this.appliedWeight = appliedWeight;
    }

    public Client getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(Client activeUser) {
        this.activeUser = activeUser;
    }
}