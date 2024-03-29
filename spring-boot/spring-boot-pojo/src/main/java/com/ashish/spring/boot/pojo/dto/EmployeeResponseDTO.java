package com.ashish.spring.boot.pojo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeResponseDTO {
    private String status;
    private int noOfRecords;
    private List<EmployeeDTO> employees;
    private List<EmployeeDTO> permanents;
    private List<EmployeeDTO> provisionals;
    private ErrorDTO error;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNoOfRecords() {
        return noOfRecords;
    }

    public void setNoOfRecords(int noOfRecords) {
        this.noOfRecords = noOfRecords;
    }

    public List<EmployeeDTO> getEmployees() {
        if(this.employees==null){this.employees=new ArrayList<>();}
        return employees;
    }

    public List<EmployeeDTO> getPermanents() {
        if(this.permanents==null){
            this.permanents=new ArrayList<>();
        }
        return permanents;
    }

    public List<EmployeeDTO> getProvisionals() {
        if(this.provisionals==null){
            this.provisionals=new ArrayList<>();
        }
        return provisionals;
    }

    public void setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
    }

    public ErrorDTO getError() {
        return error;
    }

    public void setError(ErrorDTO error) {
        this.error = error;
    }
}
