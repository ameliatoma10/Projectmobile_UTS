package com.example.bestanime.data

import com.example.bestanime.R
import com.example.bestanime.model.Anime

class DataSource { \\Untuk menampilkan data dari model Anime ke elemen UI, Anda menggunakan fungsi dalam kelas DataSource.
    fun loadAnimes(): List<Anime> {
        return listOf(
            Anime(R.string.anime1, R.drawable.image1, "Anime Spy X family menceritakan mengenai petualangan agen rahasia yang menjalankan sebuah misi-misi yang tidak terduga. Misi terpenting dari Spy X Family yakni untuk menjaga perdamaian antar negara dengan cakupan wilayah Westalis di barat dan Ostania di timur"),
            Anime(R.string.anime2, R.drawable.image2, "Kimetsu no Yaiba adalah kisah klasik tentang pertempuran antara kebaikan dan kejahatan. Tanjiro dan Korps Pembunuh Iblis berjuang melawan iblis dan Muzan Kibutsuji untuk melindungi umat manusia. Kimetsu no Yaiba telah menjadi salah satu manga paling populer di dunia."),
            Anime(R.string.anime3, R.drawable.image3, "Kimi no Na wa (Your Name) adalah film animasi Jepang yang mengisahkan tentang dua remaja, Mitsuha dan Taki, yang secara misterius bertukar tubuh. Mitsuha, yang tinggal di desa kecil, mendambakan kehidupan di Tokyo, sementara Taki adalah seorang siswa di kota besar. Ketika mereka bertukar tubuh, mereka mulai berkomunikasi melalui catatan dan pesan, membangun ikatan yang kuat meskipun terpisah oleh jarak dan waktu. Namun, ketika Taki berusaha menemukan Mitsuha secara langsung, dia menyadari bahwa ada sesuatu yang lebih besar yang mengancam mereka berdua. Film ini mengeksplorasi tema cinta, takdir, dan hubungan antar manusia dengan latar belakang yang indah dan emosional."),
            Anime(R.string.anime4, R.drawable.image4, "Hunter x Hunter adalah anime yang mengikuti petualangan Gon Freecss, seorang anak muda yang bercita-cita menjadi Hunter, yaitu individu yang memiliki kemampuan luar biasa dan dapat mengeksplorasi dunia, menangkap monster, dan menemukan harta yang langka. Dalam perjalanannya, Gon bertemu dengan teman-teman seperti Killua, seorang pembunuh berbakat, dan bersama-sama mereka menghadapi berbagai tantangan, termasuk ujian Hunter yang ketat dan berbagai musuh yang kuat. Dengan dunia yang kaya dan kompleks, anime ini mengeksplorasi tema persahabatan, pencarian jati diri, dan perjuangan melawan kekuatan jahat, semuanya dikemas dalam alur cerita yang mendalam dan karakter yang berkembang."),
            Anime(R.string.anime5, R.drawable.image5, "One Punch Man adalah anime yang mengisahkan Saitama, seorang superhero yang memiliki kekuatan luar biasa dan mampu mengalahkan musuhnya dengan satu pukulan. Setelah menjalani pelatihan ekstrem selama tiga tahun, Saitama mendapati dirinya merasa bosan karena tidak ada tantangan yang sebanding dengan kemampuannya. Dalam perjalanan hidupnya sebagai pahlawan, ia bertemu berbagai karakter, termasuk Genos, seorang cyborg yang ingin menjadi muridnya, dan anggota asosiasi pahlawan yang beragam. Meskipun Saitama tampak biasa dan sering kali diabaikan, anime ini menyoroti tema tentang arti kekuatan, pencarian makna dalam kehidupan, dan tantangan yang dihadapi oleh seorang pahlawan yang tidak pernah merasa puas."),
            Anime(R.string.anime6, R.drawable.image6, "Blue Lock adalah anime yang berfokus pada sepak bola, mengikuti perjalanan para pemain muda yang berpartisipasi dalam program intensif untuk menemukan striker terbaik di Jepang. Program ini dipimpin oleh pelatih kontroversial, Jinpachi Ego, yang percaya bahwa egoisme adalah kunci untuk mencapai kesuksesan. Para pemain berjuang dengan tantangan fisik dan mental, mengeksplorasi ambisi dan impian mereka dalam mengejar tujuan menjadi striker terbaik."),
            Anime(R.string.anime7, R.drawable.image7, "Naruto mengikuti kisah Naruto Uzumaki, seorang ninja muda yang bercita-cita menjadi Hokage, pemimpin desa ninja, sambil berjuang dengan masa lalunya sebagai anak yatim piatu yang diasingkan. Dalam perjalanannya, ia berteman dengan teman-teman sekelasnya, seperti Sasuke dan Sakura, dan menghadapi berbagai musuh yang mengancam desa mereka. Anime ini mengeksplorasi tema persahabatan, pengorbanan, dan pencarian identitas."),
            Anime(R.string.anime8, R.drawable.image8, "Attack on Titan berlatar di dunia di mana umat manusia dihadapkan pada ancaman dari raksasa pemakan manusia yang disebut Titans. Cerita berfokus pada Eren Yeager dan teman-temannya, Mikasa dan Armin, yang bergabung dengan militer untuk melawan Titans setelah desa mereka diserang. Seiring berjalannya waktu, mereka mengungkap kebenaran kelam di balik Titans dan perjuangan umat manusia untuk bertahan hidup."),
            Anime(R.string.anime9, R.drawable.image9, "Haikyuu!! mengisahkan tentang Shoyo Hinata, seorang siswa SMA yang berambisi menjadi pemain voli hebat meskipun memiliki tinggi badan yang pendek. Setelah bergabung dengan tim voli, ia bekerja keras untuk mengatasi rintangan dan berlatih bersama teman-teman se-timnya, termasuk Kageyama, setter berbakat. Anime ini menyoroti semangat tim, persahabatan, dan dedikasi dalam mencapai tujuan bersama."),
            Anime(R.string.anime10, R.drawable.image10, "Horimiya adalah cerita romantis yang mengikuti hubungan antara Hori dan Miyamura, dua siswa SMA dengan kepribadian yang berbeda. Hori adalah gadis populer yang tampak kuat, sementara Miyamura adalah siswa pendiam dengan sisi yang lebih lembut. Saat mereka saling mengenal di luar sekolah, mereka menemukan kedalaman satu sama lain, membangun hubungan yang penuh kehangatan dan pengertian. Anime ini mengeksplorasi tema cinta, pertemanan, dan penerimaan diri."),
        )
    }
}
