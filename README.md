Hayatta Kalma Oyunu
Bu proje, **Nesne Yönelimli Programlama (OOP)** prensiplerini uygulamalı olarak pekçiştirmek amacıyla geliştirilmiş basit bir hayatta kalma oyunudur. Oyunun temel amacı, belirli bölgelerde dolaşarak **düşmanlarla savaşmak, kaynak toplamak ve hayatta kalmaktır**.
## 🚀 Projenin Amacı ##

Bu proje, aşağıdaki **Nesne Yönelimli Programlama** kavramlarını uygulamak ve pekşitirmek için tasarlanmıştır:
- **Soyutlama (Abstraction)**: Genel bölgeler ve düşmanlar soyut sınıflar olarak tasarlanmıştır.
- **Kapsülleme (Encapsulation)**: Oyuncu ve düşman verilerine doğrudan erişim engellenmiştir. Getter Setter metotları ile.
- **Kılıtım (Inheritance)**: Ortak yapılar temel sınıflardan türetilmiştir.
- **Çok Biçimlilik (Polymorphism)**: Metotlar çeşitli sınıflarda farklı şekilde uygulanmıştır. Daha çok Overriding uygulanmıştır.
- 
Bu sayede oyun mekaniklerini geliştirirken **modüler bir kod yapısı** oluşturulmuş ve temiz kod prensiplerine uygun bir proje gerçekleştirilmiştir.
---
## 🎮 Oyun Mekanikleri

- Oyuncu **farklı bölgelerde hareket edebilir** ve burada **düşmanlarla savaşabilir, kaçabilir, storedan silah veya zırh alabilir**.
- **Savaş kazandıkça** oyuncu **altın, silah ve zırh** gibi eşyalara sahip olabilir.
- Oyuncunun **sağlığı, parası ve envanteri** dinamik olarak güncellenir.
- **Düşmanlar** rastgele oluşturulur ve oyuncuya zarar verebilir.
- **Oyuncu’nun kararları** oyunun gidişatını doğrudan etkiler.
---
## 🏗 Teknik Yapı
Proje, birbirinden ayrılabilir modüllerden oluşan bir OOP yapısına sahiptir. 
Ana bölümler şunlardır:
1️⃣ Karakterler
Player (Oyuncu): Oyuncunun temel bilgilerini ve envanterini tutar.
Enemy (Düşmanlar): Oyuncuyla savaşan çeşitli düşman türlerini içerir. Örnekler: Zombie, Vampire, Bear.
2️⃣ Oyun Mekanikleri
Battle (Savaş Sistemi): Oyuncu ve düşman arasındaki savaş mekanizmasını yönetir.
Battle sırasında can azalma gibi durumlar için Get ve Set metotlarıyla işlem yaparak **Encapsulation** uygulanmıştır. Ve bunlar sonucu can azalma durumları gerçekleştirilir.
Inventory (Envanter Sistemi): Oyuncunun kazandığı eşya ve kaynakları takip eder. İstenen itemler toplandığında oyun biter.
Shop (Mağaza Sistemi): Oyuncunun alışveriş yapmasına olanak tanır.
3️⃣ Dünya & Ortam
Location (Bölgeler): Oyunun oynandığı farklı mekânları temsil eden soyut sınıf.
Alt Bölgeler:
SafeHouse: Oyuncunun dinlenebildiği güvenli bölge.
River: Random olarak atanan sayıda AYI çıkma riski içeren bir keşif noktası.
Forest: Random olarak atanan sayıda VAMPİR çıkma riski içeren bir keşif noktası.
Cave: Random olarak atanan sayıda ZOMBİ çıkma riski içeren bir keşif noktası.

## 🔧 Geliştirme Süreci
Bu proje sayesinde modüler kod yazmanın önemini, sınıf tasarımının oyun mekaniklerine etkisini ve temiz kod yazma prensiplerini daha iyi anladım.

![Ekran görüntüsü 2025-02-02 174848](https://github.com/user-attachments/assets/715d2854-d42a-4645-932e-90f55046493e)
![Ekran görüntüsü 2025-02-02 174934](https://github.com/user-attachments/assets/c4fa4e6f-3434-47b2-a09f-39de6476ef6d)

