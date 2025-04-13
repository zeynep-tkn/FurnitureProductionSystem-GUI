# 🛋️ Mobilya Üretim Sistemi (JavaFX - Abstract Factory Deseni)

Bu proje, JavaFX kullanılarak tasarlanmış bir **Mobilya Üretimi Uygulamasıdır**. Uygulama GUI tabanlı olup, kullanıcıların farklı mobilya türleri (Chair, Sofa, CoffeeTable) ve stilleri (Modern, Victorian, ArtDeco) seçerek üretim gerçekleştirmesine olanak tanır.

Projede **Abstract Factory**, **Prototype** ve **Singleton** tasarım desenleri etkin bir şekilde uygulanmıştır. SOLID prensipleri göz önünde bulundurulmuş ve kodda yüksek modülerlik sağlanmıştır.

---

## 🚀 Özellikler

- 🏭 **Abstract Factory Deseni**: Stil (Modern, Victorian, ArtDeco) bazlı mobilya üretimi
- 🧬 **Prototype Deseni**: Üretilen mobilyaların klonlanabilmesi (kopya oluştur)
- 🔁 **Singleton Deseni**: Son üretilen mobilya nesnesinin merkezi olarak saklanması
- 🎨 **GUI Arayüzü (JavaFX)**: Sezgisel kullanıcı arayüzü ile stil ve tür seçimi, görselleştirme
- 🖼️ **Mobilya görselleri**: Üretilen mobilya, uygun resim ile ImageView üzerinde gösterilir
- 📋 **Son üretimi gör** ve **kopyasını oluştur** işlevleri

---

## 🛠️ Kullanılan Desenler ve Açıklamaları

### 1. 🏭 Abstract Factory
- Stil seçimine göre uygun fabrika (`ModernFurnitureFactory`, `VictorianFurnitureFactory`, vb.) oluşturulur.
- Bu fabrikalar, aynı stilin farklı ürünlerini (`Chair`, `Sofa`, `CoffeeTable`) üretir.

```java
AbstractFurnitureFactory factory = getFactory(stil);
Furniture mobilya = switch (tur) {
    case "Chair" -> factory.createChair();
    case "Sofa" -> factory.createSofa();
    case "CoffeeTable" -> factory.createCoffeeTable();
};
