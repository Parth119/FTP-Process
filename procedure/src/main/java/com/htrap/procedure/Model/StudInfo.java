package com.htrap.procedure.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudInfo {
    Integer StudentId;
    String StudentName;
    String SubjectName;
    Float ObtainedMarks;
}
