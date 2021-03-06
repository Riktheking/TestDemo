import java.awt.*;
public class Room {

	
	public int worldWidth = 10;
	public int worldHeight = 6;
	public int blockSize = 64 ;
	
	public Block[][] block;
	
	public Room(){
		define();
	}


	public void define() {
	block= new Block [worldHeight][worldWidth];
	
	for(int y=0;y<block.length;y++){
		for (int x=0;x<block[0].length;x++){
			block[y][x] = new Block((Screen.myWidth/2)-((worldWidth*blockSize)/2)+(x * blockSize), y * blockSize,  blockSize, blockSize,0,0);
			}
		}
	}


	public void physic(){
	
	}
	
	public void draw(Graphics g){
		for(int y=0;y<block.length;y++){
			for (int x=0;x<block[0].length;x++){
				block[y][x].draw(g);
			}
		}
	
	}
}
