// let images = [];
// // const free = [];
// const images_box = document.querySelector('.slider');
// $(document).ready(function(){
//     $('#takePhotos').click(function (e) {
//         redirect();
//         e.preventDefault();
//         let body = $('#searchInput').val();
//         fetch(`http://localhost:8085/api/photos/${body}`)
//             .then(response => response.json())
//             .then(json => {
//                 for (let j = 0; j < json.length; j++) {
//                     images.push(json[j])
//                 }
//             })
//     });
// });
//
// const slider_img = document.querySelector('.slider-img');
// let index = document.querySelector('#index');
// let i = 0;
// function next(){
//     if(i >= images.length-1) i = -1;
//     i++;
//     return setImg();
// }
//
// function prev(){
//     if(i <= 0) i = images.length;
//     i--;
//     return setImg();
// }
//
// function setImg(){
//     index.innerHTML = i;
//     slider_img.setAttribute('src', images[i]);
// }
//
// function redirect(){
//     images = [];
//     i = 0;
//     index.innerHTML = i;
//     slider_img.setAttribute('src', 'https://farm66.staticflickr.com/65535/51258600988_29af2b93df.jpg')
// }