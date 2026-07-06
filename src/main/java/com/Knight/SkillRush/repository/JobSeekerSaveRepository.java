package com.Knight.SkillRush.repository;

import com.Knight.SkillRush.entity.JobPostActivity;
import com.Knight.SkillRush.entity.JobSeekerProfile;
import com.Knight.SkillRush.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {
    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);
    List<JobSeekerSave> findByJob(JobPostActivity job);
}
