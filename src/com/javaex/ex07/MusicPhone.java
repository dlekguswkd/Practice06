package com.javaex.ex07;

public class MusicPhone extends Phone{
	
	// 2. Phone.java 와 MusicPhone.java 는 변경하지 않습니다.
    
    public void execute(String str){
        
        if("음악".equals(str)){
            playMusic();
        }else{
            super.execute(str);
        }
        
    }
    
    protected void playMusic(){
        System.out.println("Mp3플레이어에서 음악재생");
    }
}
