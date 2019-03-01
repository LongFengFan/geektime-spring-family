package geektime.spring.data.mybatisdemo.query;

import com.github.pagehelper.Page;

import java.util.ArrayList;
import java.util.List;

public class PageResult<T> {
    private final List<T> content = new ArrayList<>();
    private Integer pageNumber;
    private Integer pageSize;
    private Long total;
    private Integer pages;

    public PageResult(Integer pageNumber, Integer pageSize, Long total, Integer pages ,List<T> content) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.total = total;
        this.pages = pages;
        this.content.addAll(content);
    }

    public static <E> PageResult convertByPage(Page<E> page) {
        return new PageResult(page.getPageNum(),page.getPageSize(),page.getTotal(),page.getPages(),page.getResult());
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "content=" + content +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", pages=" + pages +
                '}';
    }
}
