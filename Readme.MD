# git-training

git init:       tạo 1 cái DB Local:     .git  ( Local Repository )
// Khi nhấn câu lệnh này từ File bắt đầu nào thì sẽ bắt đầu liên kết từ thư mục đó
// File chứa thêm 1 file ngầm:      .git (tức file tổng quản lí bởi git và là DB local)

git remote add origin https://github.com/newgate2601/git-training-proptit.git        
// liên kết 2 repository Local và trên Git lại với nhau
// remote: liên kết
// add origin: tạo ra cái liên kết tên "origin" mà liên kết tới cái Repository (link sau đó)

( git remote -v    : xem có những liên kết remote nào trong đây )

( git status       : xem trạng thái hiện tại của File so sánh với Repository trên Git ) 
git add Readme.MD
git add .     // add nhiều file


