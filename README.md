# JWT Nedir?

JSON Web Token (JWT), web uygulamalarında güvenli ve taşınabilir bir şekilde bilgi alışverişi yapmak için kullanılan bir açık standarttır. JWT'ler, veriyi dijital olarak imzalayarak güvence altına alırlar ve bu sayede bilgilerin doğruluğunu ve bütünlüğünü sağlarlar. JWT kimlik doğrulama ve yetkilendirme amacıyla kullanılır.

## JWT Yapısı
![enter image description here](https://github.com/salihsenturk97/JwtAuthenticationExample/blob/main/src/main/resources/Jwt.png?raw=true)

Bir JWT, üç temel bölümden oluşur:

1. **Başlık (Header):** JWT'nin tipini ve kullandığı algoritmayı belirtir. Başlık JSON formatında kodlanır ve ardından Base64 URL güvenli kodlanır.

2. **Veri Yüküsü (Payload):** İçeriği taşıyan kısım olarak düşünülebilir. Kullanıcı bilgileri, izinler veya diğer özelleştirilmiş veriler bu bölümde yer alabilir. Veri yüküsü de JSON formatında kodlanır ve Base64 URL güvenli kodlanır.

3. **İmza (Signature):** JWT'nin doğruluğunu ve bütünlüğünü sağlamak için kullanılır. İmza, başlık ve veri yüküsünün belirli bir algoritma ile işlenip gizli bir anahtarla şifrelenmesi sonucunda elde edilir.

## JWT Kullanım Alanları

JWT'ler birçok farklı senaryoda kullanılabilir:

- **Kimlik Doğrulama:** Kullanıcıların kimlik doğrulama süreçlerinde kullanılır. Kullanıcı adı ve parola gibi kimlik bilgileri sunucuya gönderilerek JWT alınabilir. Bu JWT daha sonra diğer isteklerde kimlik doğrulaması yapmak için kullanılabilir.

- **Yetkilendirme:** Kullanıcılara erişim izinleri atanabilir ve bu izinler JWT içinde taşınabilir. Böylece korunan kaynaklara erişim kontrolü sağlanabilir.

- **Tek Oturum Açma (Single Sign-On - SSO):** Birden fazla uygulamada oturum açma işlemini tek bir kimlik doğrulama ile yönetmek için kullanılabilir.

## JWT Avantajları

- **Taşınabilirlik:** JWT'ler taşınabilir ve hafif veri yapılarıdır, bu nedenle farklı sistemler arasında kolayca taşınabilirler.
- **Özelleştirme:** Veri yüküsü özelleştirilebilir, böylece farklı uygulama senaryolarına uygun kullanım sağlanabilir.
- **Bağımsızlık:** JWT'ler sunucu taraflı oturum yönetimi gerektirmez, bu da ölçeklenebilirliği artırabilir.
## Proje Oluşturma

- [x] Spring Boot projesi oluşturun ve gerekli bağımlılıkları ekleyin.
- [x] UserDetails, entity, request-response ve dto tiplerini oluşturun.
- [x] UserRepository JpaRepository oluşturun.
- [x]  JwtService ile JWT token oluşturun.
- [x]  JwtAuthenticationFilter ile gelen isteklerdeki token'ları doğrulayın.

## Spring Security ve JWT Entegrasyonu

- [x] SecurityConfig ile Spring Security ayarlarını yapılandırın.
- [x]  AuthenticationController ile kullanıcı kimlik doğrulama işlemlerini yönetin.
- [x]  AuthenticationService ile kimlik doğrulama işlemlerini gerçekleştirin.
- [x] MainPageController altında veya farklı bir controller oluşturarak kimlik doğrulaması gerektiren bir örnek endpoint oluşturun.

## Kullanım

1. **Projeyi Başlatın**: İlk olarak, projenizi bir IDE'de açın ve uygulamayı başlatın.

2. **Kayıt Olun ve Token Alın**: Postman veya benzer bir API test aracı kullanarak aşağıdaki adımları takip edin:
   - `POST /login/save` endpoint'ini kullanarak yeni bir kayıt oluşturun ve JWT token alın.

3. **Profil Bilgisini Görüntüleyin**: Alınan token ile aşağıdaki adımı gerçekleştirin:
   - `GET /dashboard` endpoint'ini çağırarak kullanıcı profilini görüntüleyin.

4. **Özel Endpoints**: `SecurityConfig` sınıfında yapılandırdığınız ayarlara göre `/index` ve `/login` endpoint'leri token gerektirmeyecektir.

5. **Yeni Token Alma**: Daha önce kaydolduğunuz kullanıcı için tekrar `POST /auth` endpoint'ini kullanarak token alabilirsiniz.

## Postman Ekran Görüntüleri
-   **`POST /login/save`**
    ![enter image description here](https://github.com/salihsenturk97/JwtAuthenticationExample/blob/main/src/main/resources/loginsave.png?raw=true)
-   **`GET/index`**
    ![enter image description here](https://github.com/salihsenturk97/JwtAuthenticationExample/blob/main/src/main/resources/index.png?raw=true)
-   **`GET/dashboard`**
    ![enter image description here](https://github.com/salihsenturk97/JwtAuthenticationExample/blob/main/src/main/resources/dashboard.png?raw=true)

Bu adımları takip ederek, projemin kimlik doğrulama mekanizmasını anlayabilir ve test edebilirsiniz. Kodlarımı ve yazımı incelediğiniz için teşekkür ederim