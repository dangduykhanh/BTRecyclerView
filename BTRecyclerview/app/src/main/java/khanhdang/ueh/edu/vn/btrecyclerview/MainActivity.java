package khanhdang.ueh.edu.vn.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PaperListAdapter paperlistadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        paperlistadapter = new PaperListAdapter(this,getlistnewspaper());
        recyclerView.setAdapter(paperlistadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private List<Newspaper> getlistnewspaper() {
        List<Newspaper> mpaperlist = new ArrayList<>();
        mpaperlist.add(new Newspaper("'Địa chấn' ở Thung lũng Silicon",
                "Sáng 10-3 (giờ Mỹ), Ngân hàng Silicon Valley (SVB) chính thức dừng hoạt động. " +
                        "Đây là sự sụp đổ lớn thứ hai của một tổ chức tài chính trong lịch sử Mỹ kể từ năm 2008.",
                "SVB - ngân hàng lớn thứ 16 của Mỹ với tài sản 209 tỉ USD - đã sụp đổ trong 48 giờ. Các nhà quản lý bang California, " +
                        "Mỹ đã đóng cửa SVB và đặt ngân hàng này dưới sự kiểm soát của Tập đoàn Bảo hiểm tiền gửi liên bang Mỹ (FDIC). \n" +
                        "\n" + "Theo đó FDIC sẽ thanh lý tài sản của SVB để trả cho người gửi tiền và các chủ nợ của ngân hàng này.",
                "https://cdn.tuoitre.vn/thumb_w/730/471584752817336320/2023/3/11/svb-ngay-10-3-5read-only-1678546394911536437209.jpg"));

        mpaperlist.add(new Newspaper("Súng đạn Mỹ bày bán như rau",
                "Chỉ trong 64 ngày đầu năm 2023, số vụ xả súng hàng loạt tại nước này đã vượt 100 vụ. " +
                        "Nhưng cuộc tranh cãi về sở hữu súng đạn vẫn gây chia rẽ nước Mỹ.",
                "Trong năm 2022, tại Mỹ xảy ra 647 vụ xả súng hàng loạt, đánh dấu năm bạo lực súng đạn nghiêm trọng thứ hai trong vòng một thập kỷ qua tại nước này, " +
                        "sau các con số 690 vụ với 706 người thiệt mạng năm 2021. \n" +
                        "Tổ chức phi lợi nhuận Gun Violence Archive (GVA) cho biết thêm các vụ xả súng hàng loạt đẫm máu nhất từ đầu năm đến nay đều xảy ra vào tháng 1, " +
                        "gồm một vụ tại vũ trường ở thành phố Monterey Park của bang California khiến 12 người thiệt mạng; " +
                        "một vụ khác xảy ra tại hai địa điểm ở Half Moon Bay, bang California, trong đó một tay súng tình nghi 66 tuổi sát hại 7 người.",
                "https://cdn.tuoitre.vn/thumb_w/1060/471584752817336320/2023/3/12/sung-my-8-1678589128634564312592.jpg"));

        mpaperlist.add(new Newspaper("Nghệ sĩ cải lương Diệp Lang qua đời",
                "Nghệ sĩ nhân dân Hồng Vân nghẹn ngào cho Tuổi Trẻ Online hay, " +
                        "Diệp Tiên - con trai nghệ sĩ Diệp Lang - đã gọi điện khóc báo tin rằng ba anh đã qua đời sáng 11-3 tại Mỹ (giờ địa phương).",
                "Nghệ sĩ Hồng Vân nói thêm bấy lâu Diệp Lang vốn bị bệnh, bác sĩ thông báo cùng gia đình chuẩn bị tinh thần bởi ông có thể ra đi bất cứ lúc nào.\n" +
                        "Tuy nhiên, Diệp Tiên đau buồn cho biết nghệ sĩ Diệp Lang đi quá nhanh và đột ngột với gia đình. " +
                        "Hôm qua ông bị mệt, như mọi lần khác gia đình có gọi điện nhờ y bác sĩ hỗ trợ. " +
                        "Tưởng ông sẽ vượt qua nhưng rất nhanh ông nhắm mắt và qua đời như đi vào giấc ngủ - Hồng Vân xúc động chia sẻ.",
                "https://cdn.tuoitre.vn/471584752817336320/2023/3/12/e9f46f968c158fdbda86a394b1cf99031293165035-1678560393268561572962.jpg"));

        mpaperlist.add(new Newspaper("Mùa chim yêu giữa thành phố tháng 3",
                "Vài ngày cuối tháng 2 và kéo dài qua đến tháng 3, " +
                        "đội quân săn ảnh chim ở TP.HCM tất bật ngược xuôi để chộp những bức ảnh đẹp của loài lông vũ vào mùa yêu đương.",
                "Vài ngày cuối tháng 2, giới săn ảnh chim ở TP.HCM kéo nhau qua khu đất trống cạnh đình thần An Khánh (TP Thủ Đức, qua cầu Thủ Thiêm 2 rẽ phải) " +
                        "để chụp ảnh 3 đôi chim trảu đầu hung (tên khoa học: Green Bee-eater; Bộ Sả Coraciiformes; Họ Trảu Meropidae) đang chọn nơi này làm ổ."+
                        " Tháng 3 với con người là tháng của phụ nữ khi có ngày 8-3! Với trảu, những con chim mái ở những ngày đầu tháng 3 này cũng là nữ hoàng.",
                "https://cdn.tuoitre.vn/471584752817336320/2023/3/6/yeu-chimh4-16780897536511963021304.png"));

        return mpaperlist;
    }
}