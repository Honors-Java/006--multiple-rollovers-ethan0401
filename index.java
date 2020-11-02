void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	stroke(0);

  //start creating the lines
 line(200,0,200,400);
 line(0,200,400,200);
  //Fill a black color
  if (mouseX > width/2 && mouseY > height/2){
    fill(0);
    rect(width/2,height/2,width/2,height/2);
   }
   if (mouseX < width/2 && mouseY > height/2){
     fill(0);
     rect(0,height/2,width/2,height/2);
   }
   if (mouseX > width/2 && mouseY < height/2){
     fill(0);
     rect(width/2,0,width/2,height/2);
   }
   if (mouseX < width/2 && mouseY < height/2){
     fill(0);
     rect(1,1,200,200);
   }
  //Build your conditional statement 
	

}