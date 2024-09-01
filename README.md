ĐỀ THI KẾT THÚC HỌC PHẦN LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG

+ Ngành: Công nghệ thông tin 
+ Đề số: 01
+ Trình độ đào tạo: Đại học 
+ Thời gian làm bài: 75 phút 
+ Số trang đề thi: 02
+ Hướng dẫn: Sinh viên KHÔNG được sử dụng tài liệu.
  
Câu 1 [5 điểm]: Lập trình hướng đối tương (OOP)
Sử dụng 1 JAVA IDE, các lớp kế thừa từ một lớp gốc (trừu tượng) và 1 interface mô tả đối 
tượng Person, Staff, OfficeStaff, SalesAgent, ITStaff như sau:

+ Lớp Person trừu tượng:
String name. int age, gender: public, có thể truy cập từ ngoài lớp.
String bank_account: protected, có thể truy cập từ các lớp con.

+ Hàm Constructor.
String getRole(): Phương thức trừu tượng.

+ Interface KPIE:
double calculateKPI(): Phương thức trong interface KPIE định nghĩa chức năng để tính KPI. 

+ Lớp Staff:
String StaffID: public (nếu đặt là private/protected thì cần hàm get/set).
float kpi: private.
String specialize: Biến private lưu trữ thông tin về chuyên ngành của sinh viên.
Constructor: Staff (String name, String StaffID, int age, String gender): của lớp Staff nhận 
thông tin đầu vào và gọi constructor của lớp cha Person để thiết lập tên.
public String getRole(): Ghi đè phương thức getRole của lớp Person, để trả về chuỗi " Staff ".
public double calculateKPI(): Ghi đè phương thức calculateKPI() để tính KPI của sinh viên để 
trả về kpi.

+ Lớp OfficeStaff, SalesAgent, ITStaff kết thừa (dẫn xuất) từ Staff:
Các lớp con gọi constructor của lớp cha Staff và cung cấp thông tin về chuyên môn.
public String getRole(): Ghi đè phương thức getRole() để trả về vai trò cụ thể của từng loại
nhân viên.

+ Lớp chứa main():
Trong hàm main, tạo 2 đối tượng OfficeStaff, SalesAgent .
+sử dụng phương thức toString() để in thông tin chi tiết của từng đối tượng.
+sử dụng phương thức getRole() và calculateKPI() để in thông tin vai trò và KPI của từng đối 
tượng.

+ Chú ý: Mã code trên thể hiện sự kết hợp của kế thừa, ghi đè phương thức, và sử dụng các biến và 
phương thức với các mức truy cập khác nhau (private, protected, public) để tạo ra một cây phân 
cấp các lớp liên quan đến sinh viên.

Câu 2 [3 điểm]: Lập trình
Viết hàm trong lớp chứa main(), nhập vào 1 số nguyên dương n. Nhập sai thì nhập lại.
Viết hàm trong lớp chứa main(), nhập vào 1 mảng n đối tượng Student, n là tham số của hàm. 
Cách nhập mỗi đối tượng Staff như sau:
+ nhập khoa của sinh viên thuộc chỉ 1 trong các xâu "VP","BH","IT" tương ứng đối tượng được 
tạo ra là OfficeStaff, SalesAgent, ITStaff
+ nhập StaffID (số có đúng 9 ký tự), name, age (nhỏ hơn 150), gender đúng định dạng biến. 
Viết hàm trong lớp chứa main(), hiển thị mảng đối tượng.
Gọi các hàm trên trong hàm main() để nhập và hiển thị mảng n đối tượng đúng theo từng loại đối 
tượng OfficeStaff, SalesAgent, ITStaff.

Câu 3 [2 điểm]: Giao diện đồ họa
Thiết kế UI (Chọn Controls, đặt Tab Order, chỉnh size và căn vị trí Controls):
Thiết kế form gồm 1 label, 1 TextFiled ô nhập mã nhân viên (mnv), 1 button Tìm kiếm và 1 button 
Thoát (chương trình được đóng khi nhấn nút Thoát), và 1 Table gồm 5 cột để hiển thị mảng đã 
nhập ở câu 2: Mã nhân viên, Họ tên, Tuổi, Giới tính, Chuyên môn.
+đặt form tiêu đề tiếng Việt, size, cỡ và vị trí các điều khiển phù hợp.
+đặt tab order phù hợp.

Yêu cầu về UI (user interface) của form như sau:
+ đặt tiêu đề form tiếng Việt.
+ đặt tab order phù hợp cho các điều khiển.
+ đặt vị trí và kích thước phù hợp cho các điều khiển.
+ đặt forcus phù hợp khi form được load.
+khi form được hiển thì thì mnv được focus và rỗng, nút Tìm kiếm không tương tác được.
+lập trình đổ dữ liệu mảng Staff nhập ở Console vào Table khi form được hiển thị

Lập trình nắm bắt các sự kiện:
+khi mnv khác rỗng thì button Tìm kiếm sáng (tương tác được), trái lại mờ(không tương tác được).
+mnv chỉ cho phép nhập kí tự chữ số, nếu nhập sai không nhận.

Thao tác Tìm kiếm (có kiểm tra valid khi xử lý)
+ nhấn Tìm kiếm, khi mnv có text độ dài là khác 9 thì hiển thị hộp thoại thông báo "Mã nhân viên
không hợp lệ", đóng hộp thoại thì focus lại về mnv.
+ nhấn Tìm kiếm, khi mnv có text độ dài là 9, tìm dòng của Table có cột mã sinh viên trùng với 
nội dung mnv, nếu không tìm thấy thì hiển thị hộp thoại thông báo "Mã nhân viên không tìm thấy", 
đóng hộp thoại thì focus lại về mnv. Trái lại đặt dòng hiện tại của Table có nhân viên với mã được 
tìm thấy và focus về mnv.
