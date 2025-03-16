package com.ecommerce.project.payload;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {

    private List<ProductDTO> content;

    private Integer pageNumber;
    private Integer pageSize;
    private Long totalElements;
    private Integer totalPages;
    private boolean lastPage;

    public boolean isLastPage() {return lastPage;}
    public void setLastPage(boolean lastPage) {this.lastPage = lastPage;}
    public Integer getTotalPages() {return totalPages;}
    public void setTotalPages(Integer totalPages) {this.totalPages = totalPages;}
    public Long getTotalElements() {return totalElements;}
    public void setTotalElements(Long totalElements) {this.totalElements = totalElements;}
    public Integer getPageSize() {return pageSize;}
    public void setPageSize(Integer pageSize) {this.pageSize = pageSize;}
    public Integer getPageNumber() {return pageNumber;}
    public void setPageNumber(Integer pageNumber) {this.pageNumber = pageNumber;}
    public List<ProductDTO> getContent() {
        return content;
    }
    public void setContent(List<ProductDTO> content) {
        this.content = content;
    }

}
