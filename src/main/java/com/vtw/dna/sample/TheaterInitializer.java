package com.vtw.dna.sample;

import com.vtw.dna.theater.Theater;
import com.vtw.dna.theater.repository.TheaterRepository;
import org.springframework.stereotype.Service;

@Service
public class TheaterInitializer implements SampleDataInitializer {

    private final TheaterRepository repository;
    public TheaterInitializer(TheaterRepository repository) {
        this.repository = repository;
    }

    @Override
    public void generateData() {

        Theater theater1 = new Theater("CGV강변","서울특별시 광진구 구의동 546-4 테크노마트 10층");
        Theater theater2 = new Theater("CGV방학","서울특별시 도봉구 방학동 707-6, 4F~8F");
        Theater theater3 = new Theater("CGV영등포","서울특별시 영등포구 영등포동 4가 441-10번지 경방 타임스퀘어 4~7층");
        Theater theater4 = new Theater("CGV홍대","서울특별시 마포구 양화로 153 (동교동) 4층");
        Theater theater5 = new Theater("CGV등촌","서울특별시 강서구 공항대로45길 63 3층~9층 (등촌동)");
        Theater theater6 = new Theater("CGV왕십리","서울특별시 성동구 왕십리광장로 17, 5층(행당동)");
        Theater theater7 = new Theater("CGV명동","서울특별시 중구 명동2가 83-5번지 눈스퀘어 8층");
        Theater theater8 = new Theater("CGV목동","서울특별시 양천구 목동 916번지 현대백화점 지하2층");
        Theater theater9 = new Theater("CGV신촌아트레온","서울특별시 서대문구 창천동 20-25 아트레온 2층");
        Theater theater10 = new Theater("CGV여의도","서울특별시 영등포구 여의도동 국제금융로 10번지 국제금융센터 지하3층");

        create(theater1);
        create(theater2);
        create(theater3);
        create(theater4);
        create(theater5);
        create(theater6);
        create(theater7);
        create(theater8);
        create(theater9);
        create(theater10);

    }

    private void create(Theater theater) {
        repository.save(theater);
    }
}
