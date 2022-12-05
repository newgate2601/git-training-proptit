# git-training

git init:       tạo 1 cái DB Local trống rỗng:     .git  ( Local Repository )
// Khi nhấn câu lệnh này từ File bắt đầu nào thì sẽ bắt đầu liên kết từ thư mục đó
// File chứa thêm 1 file ngầm:      .git (tức file tổng quản lí bởi git và là DB local)

git remote add origin https://github.com/newgate2601/git-training-proptit.git
// liên kết 2 repository Local và trên Git lại với nhau
// remote: liên kết
// add origin: tạo ra cái liên kết tên "origin" mà liên kết tới cái Repository (link sau đó)

( git remote -v    : xem có những liên kết remote nào trong đây )

( git status       : xem trạng thái hiện tại của File so sánh với Repository trên Git )

git add .          : lưu trữ tạm thời vào Staged Area, sẵn sàng commit lên chứ chưa lưu trữ vào Repository Git/ Local
//git add Readme.MD
//git add .     // add nhiều file

git commit -m ""   : biến các file đang được quan sát thành các file được lưu trên Local
// -m: gửi lên 1 message vào commit đó, mô tả cái file này có tác dụng gì cho Team

( git log )         : xem thư mục lưu ở đâu

git branch -M main  : tạo ra 1 nhánh "main"
// cho phép làm việc trên các chi nhánh mà ko ảnh hưởng tới Project
// sau khi hoàn tất thì hợp nhất với chi nhánh chính
// đổi branch       : Switched to branch 'master' đổi sang Branch master

git push -u origin main     : đẩy cái bạn lưu trên Repository Local lên Repository Github
// origin       : đường dẫn của cái Github
// main         : branch trên Repository
