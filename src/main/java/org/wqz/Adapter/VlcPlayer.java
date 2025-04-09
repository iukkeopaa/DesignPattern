package org.wqz.Adapter;

// VLC 播放器实现高级媒体播放器接口
class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 不做处理
    }
}