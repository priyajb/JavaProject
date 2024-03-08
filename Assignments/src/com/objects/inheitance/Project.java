package com.objects.inheitance;

public class Project {
    String projectName;
    int durationinMonths;

    String domain;
    String projectManager;

    public Project(String projectName, int durationinMonths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationinMonths = durationinMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void showProjectDetails(){
        System.out.println("ProjectName:"+projectName);
        System.out.println("DurationinMonths:"+durationinMonths);

    }
}
/*class TeamOne extends Project {
    String techStack;

    String[] showTechStack() {
        String[] skills = {"java", "html", "css", "javascript"};

        return skills;
    }*/




