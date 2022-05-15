package proyecto;

public class ArenaMap {
	public static final int L, H, MAP_SPACE_X, MAP_SPACE_Y;
	public static final int S1X, S1Y, S2X,S2Y, S3X, S3Y, S4X, S4Y, S5X, S5Y, S6X, S6Y, S7X, S7Y, S8X, S8Y, S9X, S9Y, 
							S10X, S10Y, S11X, S11Y, S12X, S12Y, S13X, S13Y, S14X, S14Y, S15X, S15Y; 
	
	static {		// por acordar dimesiones
		L = 700;
		H = 104;
		MAP_SPACE_X = L / 5;
		MAP_SPACE_Y = H / 3;
		S1X = MapSquare.S1.getMinX() + (int) ((MapSquare.S1.getMaxX() - MapSquare.S1.getMinX()) / 2.0);
		S1Y = MapSquare.S1.getMinY() + (int) ((MapSquare.S1.getMaxY() - MapSquare.S1.getMinY()) / 2.0); 
		S2X = MapSquare.S2.getMinX() + (int) ((MapSquare.S2.getMaxX() - MapSquare.S2.getMinX()) / 2.0);
		S2Y = MapSquare.S2.getMinY() + (int) ((MapSquare.S2.getMaxY() - MapSquare.S2.getMinY()) / 2.0);
		S3X = MapSquare.S3.getMinX() + (int) ((MapSquare.S3.getMaxX() - MapSquare.S3.getMinX()) / 2.0);
		S3Y = MapSquare.S3.getMinY() + (int) ((MapSquare.S3.getMaxY() - MapSquare.S3.getMinY()) / 2.0);
		S4X = MapSquare.S4.getMinX() + (int) ((MapSquare.S4.getMaxX() - MapSquare.S4.getMinX()) / 2.0);
		S4Y = MapSquare.S4.getMinY() + (int) ((MapSquare.S4.getMaxY() - MapSquare.S4.getMinY()) / 2.0);
		S5X = MapSquare.S5.getMinX() + (int) ((MapSquare.S5.getMaxX() - MapSquare.S5.getMinX()) / 2.0);
		S5Y = MapSquare.S5.getMinY() + (int) ((MapSquare.S5.getMaxY() - MapSquare.S5.getMinY()) / 2.0);
		S6X = MapSquare.S6.getMinX() + (int) ((MapSquare.S6.getMaxX() - MapSquare.S6.getMinX()) / 2.0);
		S6Y = MapSquare.S6.getMinY() + (int) ((MapSquare.S6.getMaxY() - MapSquare.S6.getMinY()) / 2.0);
		S7X = MapSquare.S7.getMinX() + (int) ((MapSquare.S7.getMaxX() - MapSquare.S7.getMinX()) / 2.0);
		S7Y = MapSquare.S7.getMinY() + (int) ((MapSquare.S7.getMaxY() - MapSquare.S7.getMinY()) / 2.0);
		S8X = MapSquare.S8.getMinX() + (int) ((MapSquare.S8.getMaxX() - MapSquare.S8.getMinX()) / 2.0);
		S8Y = MapSquare.S8.getMinY() + (int) ((MapSquare.S8.getMaxY() - MapSquare.S8.getMinY()) / 2.0);
		S9X = MapSquare.S9.getMinX() + (int) ((MapSquare.S9.getMaxX() - MapSquare.S9.getMinX()) / 2.0);
		S9Y = MapSquare.S9.getMinY() + (int) ((MapSquare.S9.getMaxY() - MapSquare.S9.getMinY()) / 2.0);
		S10X = MapSquare.S10.getMinX() + (int) ((MapSquare.S10.getMaxX() - MapSquare.S10.getMinX()) / 2.0);
		S10Y = MapSquare.S10.getMinY() + (int) ((MapSquare.S10.getMaxY() - MapSquare.S10.getMinY()) / 2.0);
		S11X = MapSquare.S11.getMinX() + (int) ((MapSquare.S11.getMaxX() - MapSquare.S11.getMinX()) / 2.0);
		S11Y = MapSquare.S11.getMinY() + (int) ((MapSquare.S11.getMaxY() - MapSquare.S11.getMinY()) / 2.0);
		S12X = MapSquare.S12.getMinX() + (int) ((MapSquare.S12.getMaxX() - MapSquare.S12.getMinX()) / 2.0);
		S12Y = MapSquare.S12.getMinY() + (int) ((MapSquare.S12.getMaxY() - MapSquare.S12.getMinY()) / 2.0);
		S13X = MapSquare.S13.getMinX() + (int) ((MapSquare.S13.getMaxX() - MapSquare.S13.getMinX()) / 2.0);
		S13Y = MapSquare.S13.getMinY() + (int) ((MapSquare.S13.getMaxY() - MapSquare.S13.getMinY()) / 2.0);
		S14X = MapSquare.S14.getMinX() + (int) ((MapSquare.S14.getMaxX() - MapSquare.S14.getMinX()) / 2.0);
		S14Y = MapSquare.S14.getMinY() + (int) ((MapSquare.S14.getMaxY() - MapSquare.S14.getMinY()) / 2.0);
		S15X = MapSquare.S15.getMinX() + (int) ((MapSquare.S15.getMaxX() - MapSquare.S15.getMinX()) / 2.0);
		S15Y = MapSquare.S15.getMinY() + (int) ((MapSquare.S15.getMaxY() - MapSquare.S15.getMinY()) / 2.0);
	}
	
}
