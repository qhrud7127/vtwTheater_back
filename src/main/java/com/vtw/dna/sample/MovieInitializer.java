package com.vtw.dna.sample;

import com.vtw.dna.movie.Movie;
import com.vtw.dna.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class MovieInitializer implements SampleDataInitializer {

    private final MovieRepository repository;

    public MovieInitializer(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void generateData() {

        Movie movie1 = new Movie(UUID.randomUUID().toString(), "토르-러브 앤 썬더",
                "타이카 와이티티",
                "12세",
                "액션",
                "크리스 헴스워스 ,  나탈리 포트만 ,  테사 톰슨 ,  크리스찬 베일 ,  타이카 와이티티 ,  크리스 프랫",
                "119분");
        Movie movie2 = new Movie(UUID.randomUUID().toString(), "탑건-매버릭",
                "조셉 코신스키",
                "15세",
                "밀리터리",
                "톰 크루즈 ,  마일즈 텔러 ,  제니퍼 코넬리",
                "110분");
        Movie movie3 = new Movie(UUID.randomUUID().toString(), "헤어질 결심",
                "박찬욱",
                "15세",
                "로맨스",
                "탕웨이 ,  박해일 ,  이정현 ,  박용우 ,  고경표 ,  김신영",
                "138분");

        Movie movie4 = new Movie(UUID.randomUUID().toString(), "마녀(魔女) Part2",
                "박훈정",
                "15세",
                "액션",
                "신시아 ,  박은빈 ,  서은수 ,  진구 ,  성유빈 ,  조민수 ,  이종석 ,  김다미",
                "137분");
        Movie movie5 = new Movie(UUID.randomUUID().toString(), "범죄도시2",
                "이상용",
                "15세",
                "범죄",
                "마동석 ,  손석구 ,  최귀화 ,  박지환 ,  허동원 ,  하준 ,  정재광",
                "106분");
        Movie movie6 = new Movie(UUID.randomUUID().toString(), "큐어",
                "구로사와 기요시",
                "15세",
                "호러",
                "야쿠쇼 코지 ,  하기와라 마사토 ,  우지키 츠요시 ,  나카가와 안나 ,  오스기 렌",
                "111분");
        Movie movie7 = new Movie(UUID.randomUUID().toString(), "펄프 픽션",
                "쿠엔틴 타란티노",
                "15세",
                "액션",
                "존 트라볼타,  새뮤얼 L. 잭슨,  우마 서먼,  하비 카이텔",
                "153분");
        Movie movie8 = new Movie(UUID.randomUUID().toString(), "컴온 컴온",
                "마이크 밀스",
                "12세",
                "드라마",
                "호아킨 피닉스 ,  우디 노먼 ,  가비 호프만",
                "109분");
        Movie movie9 = new Movie(UUID.randomUUID().toString(), "비욘드 라이브 더 무비 : 샤이니 월드",
                "샤이니",
                "전체",
                "다큐",
                "샤이니",
                "118분");
        Movie movie10 = new Movie(UUID.randomUUID().toString(), "빅샤크4-바다공룡 대모험",
                "장초",
                "전체",
                "어드벤처",
                "김용 ,  정성원 ,  서정익 ,  김소희 ,  박시윤",
                "85분");
        Movie movie11 = new Movie(UUID.randomUUID().toString(), "홀리 모터스 무삭제판",
                "레오 까락스",
                "전체",
                "드라마",
                "드니 라방",
                "115분");
        Movie movie12 = new Movie(UUID.randomUUID().toString(), "고스트랜드",
                "니콜라스 케이지",
                "15세 이상",
                "액션",
                "스티브 카렐 ,  타라지 P. 헨슨 ,  양자경",
                "102분");
        Movie movie13 = new Movie(UUID.randomUUID().toString(), "호수의 이방인",
                "알랭 기로디",
                "전체",
                "드라마",
                "카디아 파스칼리우 ,  클라우디아 이레미아 ,  올림피아 말라이",
                "97분");
        Movie movie14 = new Movie(UUID.randomUUID().toString(), "브로커",
                "고레에다 히로카즈",
                "12세 이상",
                "드라마",
                "류준열 ,  김우빈 ,  김태리 ,  소지섭 ,  염정아 ",
                "129분");
        Movie movie15 = new Movie(UUID.randomUUID().toString(), "트윈 픽스",
                "데이빗 린치",
                "전체",
                "미스터리",
                "엠마 톰슨 ,  다릴 맥코맥",
                "135분");


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
        create(movie11);
        create(movie12);
        create(movie13);
        create(movie14);
        create(movie15);

    }

    private void create(Movie movie) {
        repository.save(movie);
    }
}