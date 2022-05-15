package proyecto;

public enum MapSquare {
	S1(0, ArenaMap.MAP_SPACE_X, 204, 204 + ArenaMap.MAP_SPACE_Y),
	S2(0, ArenaMap.MAP_SPACE_X, 204 + ArenaMap.MAP_SPACE_Y, 204 + ArenaMap.MAP_SPACE_Y * 2),
	S3(0, ArenaMap.MAP_SPACE_X, 204 + ArenaMap.MAP_SPACE_Y * 2, 204 + ArenaMap.MAP_SPACE_Y * 3),
	S4(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_X * 2, 204, 204 + ArenaMap.MAP_SPACE_Y),
	S5(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_X * 2, 204 + ArenaMap.MAP_SPACE_Y, 204 + ArenaMap.MAP_SPACE_Y * 2),
	S6(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_X * 2, 204 + ArenaMap.MAP_SPACE_Y * 2, 204 + ArenaMap.MAP_SPACE_Y * 3),
	S7(ArenaMap.MAP_SPACE_X * 2, ArenaMap.MAP_SPACE_X * 3, 204, 204 + ArenaMap.MAP_SPACE_Y),
	S8(ArenaMap.MAP_SPACE_X * 2, ArenaMap.MAP_SPACE_X * 3, 204 + ArenaMap.MAP_SPACE_Y, 204 + ArenaMap.MAP_SPACE_Y * 2),
	S9(ArenaMap.MAP_SPACE_X * 2 , ArenaMap.MAP_SPACE_X * 3, 204 + ArenaMap.MAP_SPACE_Y * 2, 204 + ArenaMap.MAP_SPACE_Y * 3),
	S10(ArenaMap.MAP_SPACE_X * 3, ArenaMap.MAP_SPACE_X * 4, 204, 204 + ArenaMap.MAP_SPACE_Y),
	S11(ArenaMap.MAP_SPACE_X * 3, ArenaMap.MAP_SPACE_X * 4, 204 + ArenaMap.MAP_SPACE_Y, 204 + ArenaMap.MAP_SPACE_Y * 2),
	S12(ArenaMap.MAP_SPACE_X * 3, ArenaMap.MAP_SPACE_X * 4, 204 + ArenaMap.MAP_SPACE_Y * 2, 204 + ArenaMap.MAP_SPACE_Y * 3),
	S13(ArenaMap.MAP_SPACE_X * 4, ArenaMap.MAP_SPACE_X * 5, 204, 204 + ArenaMap.MAP_SPACE_Y),
	S14(ArenaMap.MAP_SPACE_X * 4, ArenaMap.MAP_SPACE_X * 5, 204 + ArenaMap.MAP_SPACE_Y, 204 + ArenaMap.MAP_SPACE_Y * 2),
	S15(ArenaMap.MAP_SPACE_X * 4, ArenaMap.MAP_SPACE_X * 5, 204 + ArenaMap.MAP_SPACE_Y * 2, 204 + ArenaMap.MAP_SPACE_Y * 3);

	private int minX, maxX, minY, maxY;
	
	private MapSquare(int minX, int maxX, int minY, int maxY) {
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}
	
	public int getMaxX() {
		return this.maxX;
	}
	
	public int getMaxY() {
		return this.maxY;
	}
	
	public int getMinX() {
		return this.minX;
	}
	
	public int getMinY() {
		return this.minY;
	}
	
}
