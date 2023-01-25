package com.xloop.resourceloop.candidateprofile.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xloop.resourceloop.candidateprofile.model.CandidateAcademicInfo;
import com.xloop.resourceloop.candidateprofile.repository.ICandidateAcademicInfoRepository;

@Service
public class CandidateAcademicInfoService {
    @Autowired
    public ICandidateAcademicInfoRepository academicInfoRepo;

    public CandidateAcademicInfo createAcademicInformation(CandidateAcademicInfo academicInfo){
        return academicInfoRepo.save(academicInfo);
    }
    
    public CandidateAcademicInfo getAcademicInformationById(Long id) {
        return academicInfoRepo.findById(id).orElse(null);
    }
    
    public List<CandidateAcademicInfo> getAllAcademicInformation(){
        return academicInfoRepo.findAll();
    }

    // public CandidatePersonalInfo updatePersonalInformation(Long id, CandidatePersonalInfo personalInformation){
    //     Optional<CandidatePersonalInfo> personalInformationOptional = personalInfoRepo.findById(id);
    //     if(personalInformationOptional.isPresent()) {
    //         CandidatePersonalInfo existingPersonalInformation = personalInformationOptional.get();
    //         existingPersonalInformation.setFirstName(personalInformation.getFirstName());
    //         return existingPersonalInformation;
 
    //     }
    //     else {
    //         return null;
    //     }
    // }

    public CandidateAcademicInfo updateAcademicInformation(Long id, CandidateAcademicInfo academicInformation){
        Optional<CandidateAcademicInfo> academicInformationOptional = academicInfoRepo.findById(id);
        if(academicInformationOptional.isPresent()) {
            CandidateAcademicInfo existingAcademicInformation = academicInformationOptional.get();
            existingAcademicInformation.setCurrentDegree(academicInformation.getCurrentDegree());
            existingAcademicInformation.setCGPA(academicInformation.getCGPA());
            existingAcademicInformation.setCertificates(academicInformation.getCertificates());
            existingAcademicInformation.setTitle(academicInformation.getTitle());
            existingAcademicInformation.setUniversity(academicInformation.getUniversity());
            existingAcademicInformation.setFinal_Year_Project(academicInformation.getFinal_Year_Project());
            existingAcademicInformation.setDegree_progress(academicInformation.getDegree_progress());

            return existingAcademicInformation;
        }
        else {
            return null;
        }
    }
    public void deleteAcademicInformation(Long id) {
        academicInfoRepo.deleteById(id);
    }


}
