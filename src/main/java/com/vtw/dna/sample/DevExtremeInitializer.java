package com.vtw.dna.sample;

import com.vtw.dna.devExtreme.DevExtreme;
import com.vtw.dna.devExtreme.repository.DevExtremeRepository;
import com.vtw.dna.movie.Movie;
import com.vtw.dna.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;


@Service
public class DevExtremeInitializer implements SampleDataInitializer {

    private final DevExtremeRepository repository;

    public DevExtremeInitializer(DevExtremeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void generateData() {

        Date date = new Date();
        DevExtreme movie1 = new DevExtreme("1번째 데이터",
                "1번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "15세",
                true,
                date,
                120);
        DevExtreme movie2 = new DevExtreme("2번째 데이터",
                "2번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                220);
        DevExtreme movie3 = new DevExtreme("3번째 데이터",
                "3번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                330);
        DevExtreme movie4 = new DevExtreme("4번째 데이터",
                "4번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                440);
        DevExtreme movie5 = new DevExtreme("5번째 데이터",
                "5번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                550);
        DevExtreme movie6 = new DevExtreme("6번째 데이터",
                "6번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                660);
        DevExtreme movie7 = new DevExtreme("7번째 데이터",
                "7번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                770);
        DevExtreme movie8 = new DevExtreme("8번째 데이터",
                "8번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                880);
        DevExtreme movie9 = new DevExtreme("9번째 데이터",
                "9번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                990);
        DevExtreme movie10 = new DevExtreme("10번째 데이터",
                "10번째 데이터의 내용 : 그냥 내용이 아니고 긴 내용이 들어가야 함",
                "청불",
                true,
                date,
                100);


        create(movie1);
        create(movie2);
        create(movie3);
        create(movie4);
        create(movie5);
        create(movie6);
        create(movie7);
        create(movie8);
        create(movie9);
        create(movie10);

    }

    private void create(DevExtreme movie) {
        repository.save(movie);
    }
}
