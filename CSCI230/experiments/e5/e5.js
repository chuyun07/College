const carouselImages = [];
let currentImageIndex = 0;

async function fetchImages() {
  const imageUrls = [
    'https://i0.wp.com/picjumbo.com/wp-content/uploads/buddha-3d-wallpaper-free-photo.jpg?w=600&quality=80', 'https://i0.wp.com/picjumbo.com/wp-content/uploads/close-up-buddha-statue-portrait-free-photo.jpeg?w=600&quality=80', 'https://i0.wp.com/picjumbo.com/wp-content/uploads/golden-buddha-free-wallpaper-free-photo.jpeg?w=600&quality=80', 'https://i0.wp.com/picjumbo.com/wp-content/uploads/buddha-wallpaper-free-photo.jpg?w=600&quality=80', 'https://i0.wp.com/picjumbo.com/wp-content/uploads/buddha-free-image-free-photo.jpeg?w=600&quality=80'
  ];
  
  for (let url of imageUrls) {
    try {
      const response = await fetch(url);
      const blob = await response.blob();
      const imageUrl = URL.createObjectURL(blob);
      carouselImages.push(imageUrl);
    } catch (error) {
      console.error(`Failed to load ${url}:`, error);
    }
  }
  
  displayImage();
}

function displayImage() {
  const imageElement = document.getElementById('carousel-image');
  imageElement.src = carouselImages[currentImageIndex];
  console.log('Current image source:', imageElement.src);
  currentImageIndex = (currentImageIndex + 1) % carouselImages.length;
}

function startCarousel() {
  fetchImages();
  setInterval(displayImage, 3000);
}

window.onload = startCarousel;
