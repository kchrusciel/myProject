package com.pazdziorek.myProject.dataModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Builder
@Table(name = "FIN_DATA")
public class FinancialData {

    @Column(name = "ID")
    public Long id;
    @Column(name = "CATEGORY")
    public String category;

    public FinancialData(Long id, String category) {

        this.id = id;
        this.category = category;
    }
}
