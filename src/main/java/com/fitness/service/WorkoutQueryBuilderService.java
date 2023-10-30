package com.fitness.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class WorkoutQueryBuilderService {

    public HttpResponse<String> buildWorkoutPerBodyPartURL(String bodyPart) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://exercisedb.p.rapidapi.com/exercises/bodyPart/" + bodyPart + "?limit=10"))
                .header("X-RapidAPI-Key", "47daba2431msh4a910d0f3b0f50dp13a2a9jsnd0e012cc6431")
                .header("X-RapidAPI-Host", "exercisedb.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    public HttpResponse<String> testNewApi() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://fitness-calculator.p.rapidapi.com/activities?intensitylevel=1"))
                .header("X-RapidAPI-Key", "47daba2431msh4a910d0f3b0f50dp13a2a9jsnd0e012cc6431")
                .header("X-RapidAPI-Host", "fitness-calculator.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }
    public HttpResponse<String> buildBodyPartListURL() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://exercisedb.p.rapidapi.com/exercises/bodyPartList"))
                .header("X-RapidAPI-Key", "47daba2431msh4a910d0f3b0f50dp13a2a9jsnd0e012cc6431")
                .header("X-RapidAPI-Host", "exercisedb.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    public HttpResponse<String> buildTargetMusclesListURL() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://exercisedb.p.rapidapi.com/exercises/targetList"))
                .header("X-RapidAPI-Key", "47daba2431msh4a910d0f3b0f50dp13a2a9jsnd0e012cc6431")
                .header("X-RapidAPI-Host", "exercisedb.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    public HttpResponse<String> buildExerciseByIdURL(Integer exerciseId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://exercisedb.p.rapidapi.com/exercises/exercise/" + exerciseId))
                .header("X-RapidAPI-Key", "47daba2431msh4a910d0f3b0f50dp13a2a9jsnd0e012cc6431")
                .header("X-RapidAPI-Host", "exercisedb.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    public HttpResponse<String> buildExerciseByNameURL(String exerciseName) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://exercisedb.p.rapidapi.com/exercises/exercise/" + exerciseName))
                .header("X-RapidAPI-Key", "47daba2431msh4a910d0f3b0f50dp13a2a9jsnd0e012cc6431")
                .header("X-RapidAPI-Host", "exercisedb.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    public HttpResponse<String> buildExercisesURL() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://exercisedb.p.rapidapi.com/exercises?limit=10"))
                .header("X-RapidAPI-Key", "47daba2431msh4a910d0f3b0f50dp13a2a9jsnd0e012cc6431")
                .header("X-RapidAPI-Host", "exercisedb.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }
}
