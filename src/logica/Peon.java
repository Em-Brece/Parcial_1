package logica;

public class Peon extends Pieza {
	public Peon(int pos_x, int pos_y) {
		super(pos_x, pos_y);
		}
	
	@Override
	public int numCasillas() throws Exception {
		
		if((this.pos_y>8||this.pos_y<1)||(this.pos_x>8||this.pos_x<1)) {
			throw new Exception("la posicion no existe en el tablero");
		}
		
		if(this.pos_y == 2) {
			return 2;
		}
		
		if(this.pos_y == 8) {
			return 0;
		}
		
		else {
			return 1;
		}
	}

}
