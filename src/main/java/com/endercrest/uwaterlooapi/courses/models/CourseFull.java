package com.endercrest.uwaterlooapi.courses.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/24/2016.
 *
 * Class containing all possible course information.
 */
public class CourseFull extends Course {

    private List<String> instructions;
    private String prerequisites;
    private String antirequisites;
    private String corequisites;
    @SerializedName("terms_offered")
    private List<String> termsOffered;
    private String notes;
    private CourseOfferings offerings;
    @SerializedName("needs_department_consent")
    private Boolean needsDepartmentConsent;
    @SerializedName("needs_instructor_consent")
    private Boolean needsInstructorConsent;
    private List<String> extra;
    @SerializedName("calendar_year")
    private String calendarYear;
    private String url;

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getAntirequisites() {
        return antirequisites;
    }

    public void setAntirequisites(String antirequisites) {
        this.antirequisites = antirequisites;
    }

    public String getCorequisites() {
        return corequisites;
    }

    public void setCorequisites(String corequisites) {
        this.corequisites = corequisites;
    }

    public List<String> getTermsOffered() {
        return termsOffered;
    }

    public void setTermsOffered(List<String> termsOffered) {
        this.termsOffered = termsOffered;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public CourseOfferings getOfferings() {
        return offerings;
    }

    public void setOfferings(CourseOfferings offerings) {
        this.offerings = offerings;
    }

    public Boolean getNeedsDepartmentConsent() {
        return needsDepartmentConsent;
    }

    public void setNeedsDepartmentConsent(Boolean needsDepartmentConsent) {
        this.needsDepartmentConsent = needsDepartmentConsent;
    }

    public Boolean getNeedsInstructorConsent() {
        return needsInstructorConsent;
    }

    public void setNeedsInstructorConsent(Boolean needsInstructorConsent) {
        this.needsInstructorConsent = needsInstructorConsent;
    }

    public List<String> getExtra() {
        return extra;
    }

    public void setExtra(List<String> extra) {
        this.extra = extra;
    }

    public String getCalendarYear() {
        return calendarYear;
    }

    public void setCalendarYear(String calendarYear) {
        this.calendarYear = calendarYear;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
