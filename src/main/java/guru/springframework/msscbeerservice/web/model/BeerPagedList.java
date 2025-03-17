package guru.springframework.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;

public class BeerPagedList extends PageImpl <BeerDto> {

    public BeerPagedList(java.util.List<BeerDto> content) {
        super(content);
    }

    public BeerPagedList(java.util.List<BeerDto> content, org.springframework.data.domain.Pageable pageable, long total) {
        super(content, pageable, total);
    }
}
