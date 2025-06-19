package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double counter = 0;
        double summ = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                summ += subject.score();
                counter++;
            }
        }
        return (summ / counter);
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        double counter = 0;
        double summ = 0;
        double score;
        List<Label> label = new ArrayList<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                summ += subject.score();
                counter++;
            }
            score = summ / counter;
            summ = 0;
            counter = 0;
            label.add(new Label(pupil.name(), score));
        }

        return label;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> label = new ArrayList<>();
        int summ;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                summ = subject.score() + map.getOrDefault(subject.name(), 0);
                map.put(subject.name(), summ);
            }
        }

        for (String key : map.keySet()) {
            label.add(new Label(key, map.get(key) / pupils.size()));
        }

        return label;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        double summ = 0;
        List<Label> label = new ArrayList<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                summ += subject.score();
            }
            label.add(new Label(pupil.name(), summ));
            summ = 0;
        }
        label.sort(Comparator.naturalOrder());
        return label.get(label.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> label = new ArrayList<>();
        int summ;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                summ = subject.score() + map.getOrDefault(subject.name(), 0);
                map.put(subject.name(), summ);
            }
        }

        for (String key : map.keySet()) {
            label.add(new Label(key, map.get(key)));
        }

        label.sort(Comparator.naturalOrder());
        return label.get(label.size() - 1);
    }
}