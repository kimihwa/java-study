package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	// 생성자 오버로딩
	public Song() {
		// some code1
		// some code2
		// some code3
	}
	
	public Song(String title, String artist) {
		// some code1
		// some code2
		// some code3
		
		//this.title = title;
		//this.artist = artist;
		
		this(title, artist, "", "", 0, 0);
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		// 수정을 위해 코드의 중복을 방지함. 리펙토링
		this();
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println(artist + " " + 
							title + " (" + 
							album + ", " + 
							year + ", " +
							track + "번 track, " +
							composer + "작곡 )");
	}
}
