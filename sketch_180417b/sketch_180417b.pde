void setup() {
  size(400, 400);
  
  background(255);
  
  
  noStroke();
  fill(200, 0, 0);
  
  for (int x = 50; x < 50+45*7; x += 45) { 
    rect(x , 50, 30, 30);
  }
  
  // draw = face
  fill(#FFFF00); 
  ellipse(width/2, height/2, 200, 225);
  
  //left eye 
  fill(0); 
  ellipse(width/2-40, height/2-50, 40, 50);
  fill(255);
  ellipse(width/2-35, height/2-40, 20, 20);
  
  // right eye 
  fill(0); 
   ellipse(width/2+40, height/2-50, 40, 50);
  fill(255);
  ellipse(width/2+35, height/2-40, 20, 20);
  
  //mouth 
  fill(0);
  ellipse(width/2+10, height/2+50, 70, 50);
}