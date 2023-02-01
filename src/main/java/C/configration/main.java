package C.configration;

import C.configration.dao.StudentDao;
import C.configration.service.StudentAllSelectService;
import C.configration.service.StudentRegisterService;
import C.configration.service.StudentSelectService;

import java.util.*;

public class main {

    public static void main(String[] args) {


        String[] sNums = {"H39r8djakndfae32", "H39asdfaelu42o23", "H39iiemamca8w9h4",
                "H39lkmn754fghia7", "H39plo865cuy8k92", "H39mnbviiaed89q1",
                "H399omjjyv56t3d5", "H39lczaqwg644gj8", "H39ymbcsh74thgh2",
                "H39lesvj7544vf89"};

        String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion",
                "tiger", "pig", "horse", "bird", "deer"};

        String[] sPws = {"96539", "94875", "15284", "48765", "28661",
                "60915", "30028", "29801", "28645", "28465"};

        String[] sNames = {"agatha", "barbara", "chris", "doris", "elva",
                "fiona", "holly", "jasmin", "lena", "melissa"};

        int[] sAges = {19, 22, 20, 27, 19, 21, 19, 25, 22, 24};
        String[] sGenders = {"M", "W", "W", "M", "M", "M", "W", "M", "W", "W"};
        String[] sMajors = {"English Literature", "Korean Language and Literature",
                "French Language and Literature", "Philosophy", "History",
                "Law", "Statistics", "Computer", "Economics", "Public Administration"};

       StudentDao studentDao = new StudentDao();

       StudentRegisterService registerService = new StudentRegisterService(studentDao);

       for (int i = 0 ; i < sNames.length; i++){
           Student student = new Student(sNums[i],sIds[i],sPws[i],sNames[i],sAges[i],sGenders[i],sMajors[i] );
           registerService.register(student);

       }

       StudentAllSelectService allSelectService = new StudentAllSelectService(studentDao);

       Map<String,Student> allSelect = allSelectService.allSelect();
        Set<String> keys = allSelect.keySet();
        // Set은 키값 구분없이 keys에 저장하는데 해쉬코드를 비교해서 동일한 값은 한번만 저장 가능하다
        //allSelect.keySey()은 키값을 저장할때 쓰는거임
        Iterator<String> iterator = keys.iterator();
        //iterator에 keys 값들을 전체를 대상으로 한번씩 반복해서 가져오는 매서드
        while (iterator.hasNext()){
            // hasNext는 그다음에 값이 있으면 True 없으면 false
            String key = iterator.next();
            // iterator.next는  그다음 값들을 하나씩 가져온다.
            Student student = allSelect.get(key);
            System.out.print(student.getsNum()+"\t");
            System.out.print(student.getsId()+"\t");
            System.out.print(student.getsPw()+"\t");
            System.out.print(student.getsName()+"\t");
            System.out.print(student.getsAge()+"\t");
            System.out.print(student.getsGender()+"\t");
            System.out.println(student.getsMajor());

        }

        TreeSet<Integer> set = new TreeSet<Integer>();
        //TreeSet은 객체를 찾거나 범위 검색과 관련된 매서드
        set.add(10);
        set.add(50);
        set.add(80);
        set.add(90);
        set.add(30);
        set.add(70);
        set.add(99);
        Integer score = null;

        for (Integer a : set){
            System.out.print(a + " \t");
        }
        System.out.println();
        score = set.first();
        System.out.println("가장 낮은 점수 : " + score);

        score = set.last();
        System.out.println("가장 높은 점수 : " + score);

        score = set.lower(new Integer(90));
        System.out.println("90점 아래 점수 : " + score);

        score = set.higher(new Integer(90));
        System.out.println("90점 위 점수 : " + score);

        score = set.floor(new Integer(80));
        System.out.println("80점 이거나 낮은 점수" + score);

        score = set.ceiling(new Integer(50));
        System.out.println("50점 이거나 높은 점수 : " + score);


    }

}
