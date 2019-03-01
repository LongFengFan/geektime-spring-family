package geektime.spring.data.mybatisdemo.query;

import lombok.Builder;

@Builder
public class PageRequest {
    private Integer pageNumber;
    private Integer pageSize;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = (pageNumber == null || pageNumber < 0) ? 1 : pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = (pageSize == null || pageSize < 0) ? 100 : pageSize;
    }
}
