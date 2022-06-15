package com.vtw.dna.sample;

import com.vtw.dna.movie.Movie;
import com.vtw.dna.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;


@Service
public class MovieInitializer implements SampleDataInitializer {

    private final MovieRepository repository;

    public MovieInitializer(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void generateData() {

        Movie movie1 = new Movie("마녀(魔女) Part2. The Other One ",
                "박훈정",
                "신시아 ,  박은빈 ,  서은수 ,  진구 ,  성유빈 ,  조민수 ,  이종석 ,  김다미",
                "15세",
                "통제불능의 존재가 세상 밖으로 나왔다!\n" +
                        " \n" +
                        "‘자윤’이 사라진 뒤, 정체불명의 집단의 무차별 습격으로 마녀 프로젝트가 진행되고 있는 ‘아크’가 초토화된다.\n" +
                        "그곳에서 홀로 살아남은 ‘소녀’는 생애 처음 세상 밖으로 발을 내딛고\n" +
                        "우연히 만난 ‘경희’의 도움으로 농장에서 지내며 따뜻한 일상에 적응해간다.\n",
                "137분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85871/85871_1000.jpg");

        Movie movie2 = new Movie("탑건-매버릭",
                "조셉 코신스키",
                "톰 크루즈 ,  마일즈 텔러 ,  제니퍼 코넬리",
                "12세",
                "한순간의 실수도 용납되지 않는 하늘 위, \n" +
                        "가장 압도적인 비행이 시작된다!",
                "130분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000082/82120/82120_320.jpg");

        Movie movie3 = new Movie("버즈 라이트이어",
                "앤거스 맥클레인",
                "크리스 에반스 ,  타이카 와이티티 ,  피터 손",
                "전체",
                "우주 저 너머 운명을 건 미션, 무한한 모험이 시작된다!\n",
                "105분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85977/85977_320.jpg");

        Movie movie4 = new Movie("범죄도시 2 ",
                "이상용",
                "마동석 ,  손석구 ,  최귀화 ,  박지환 ,  허동원 ,  하준 ,  정재광",
                "15세",
                "“느낌 오지? 이 놈 잡아야 하는 거”\n" +
                        "\n" +
                        "가리봉동 소탕작전 후 4년 뒤,\n" +
                        "금천서 강력반은 베트남으로 도주한 용의자를 인도받아 오라는 미션을 받는다.",
                "106분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85813/85813_320.jpg");

        Movie movie5 = new Movie("브로커",
                "고레에다 히로카즈 ",
                "송강호 ,  강동원 ,  배두나 ,  이지은 ,  이주영",
                "12세",
                "세탁소를 운영하지만 늘 빚에 시달리는 ‘상현’(송강호)과\n" +
                        "베이비 박스 시설에서 일하는 보육원 출신의 ‘동수’(강동원).\n" +
                        "거센 비가 내리는 어느 날 밤,\n" +
                        "그들은 베이비 박스에 놓인 한 아기를 몰래 데려간다.",
                "129분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85829/85829_320.jpg");

        Movie movie6 = new Movie("쥬라기 월드-도미니언",
                "콜린 트레보로우",
                "크리스 프랫 ,  브라이스 달라스 하워드 ,  드완다 와이즈 ,  로라 던 ,  제프 골드브럼 ,  샘 닐",
                "12세",
                "지상 최대의 블록버스터 이제 모든것이 끝난다.",
                "147분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85689/85689_320.jpg");

        Movie movie7 = new Movie("경아의 딸",
                "김정은",
                "김정영 ,  하윤경 ,  김우겸 ,  박혜진",
                "15세",
                "홀로 살아가는 경아에게 힘이 되어주는 유일한 존재인 딸 연수는 독립한 뒤로 얼굴조차 보기 어렵다. ",
                "119분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85968/85968_320.jpg");

        Movie movie8 = new Movie("실종",
                "가타야마 신조",
                "사토 지로 ,  이토 아오이 ,  시미즈 히로야",
                "청불",
                "아빠가 사라진 그곳에 그 놈이 나타났다!",
                "124분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85917/85917_320.jpg");

        Movie movie9 = new Movie("극장판 포켓몬스터DP-기라티나와 하늘의 꽃다발 쉐이미",
                " 유야마 쿠니히코",
                "이선호 ,  김영선",
                "전체",
                "끝나지 않은 전설의 포켓몬들의 배틀로 위험에 빠진 반전 세계와 현실 세계를 구하기 위해 감사포켓몬 ‘쉐이미’와 ‘지우’, ‘피카츄’가 나서면서 시작되는 모험 이야기",
                "96분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85833/85833_320.jpg");

        Movie movie10 = new Movie("헤어질 결심",
                "박찬욱",
                "탕웨이 ,  박해일 ,  이정현 ,  고경표 ,  박용우",
                "15세",
                "산 정상에서 추락한 한 남자의 변사 사건. 담당 형사 '해준'(박해일)은 사망자의 아내 '서래'(탕웨이)와 마주하게 된다.",
                "138분",
                "https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85852/85852_320.jpg");

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

    private void create(Movie movie) {
        repository.save(movie);
    }
}
