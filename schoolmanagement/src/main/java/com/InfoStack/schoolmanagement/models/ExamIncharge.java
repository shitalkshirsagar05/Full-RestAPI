package com.InfoStack.schoolmanagement.models;

public class ExamIncharge {
    int ExamInchargeId;
    String ExamInchargeName;
    int ExamInchargeSalary;
    String ExamInchargeResponsiblities;

    public ExamIncharge() {
    }

    public ExamIncharge(String examInchargeName, int examInchargeSalary, String examInchargeResponsiblities) {
        ExamInchargeName = examInchargeName;
        ExamInchargeSalary = examInchargeSalary;
        ExamInchargeResponsiblities = examInchargeResponsiblities;
    }

    public ExamIncharge(int examInchargeId, String examInchargeName, int examInchargeSalary, String examInchargeResponsiblities) {
        ExamInchargeId = examInchargeId;
        ExamInchargeName = examInchargeName;
        ExamInchargeSalary = examInchargeSalary;
        ExamInchargeResponsiblities = examInchargeResponsiblities;
    }

    public int getExamInchargeId() {
        return ExamInchargeId;
    }

    public void setExamInchargeId(int examInchargeId) {
        ExamInchargeId = examInchargeId;
    }

    public String getExamInchargeName() {
        return ExamInchargeName;
    }

    public void setExamInchargeName(String examInchargeName) {
        ExamInchargeName = examInchargeName;
    }

    public int getExamInchargeSalary() {
        return ExamInchargeSalary;
    }

    public void setExamInchargeSalary(int examInchargeSalary) {
        ExamInchargeSalary = examInchargeSalary;
    }

    public String getExamInchargeResponsiblities() {
        return ExamInchargeResponsiblities;
    }

    public void setExamInchargeResponsiblities(String examInchargeResponsiblities) {
        ExamInchargeResponsiblities = examInchargeResponsiblities;
    }
}

