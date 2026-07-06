# ☕ B&B Space (Branch & Bound Space)

Website resmi **B&B Space**, sebuah **Hybrid Café & Coworking Space** yang dibangun menggunakan **Jakarta EE (JSP & Servlet)** dengan menerapkan konsep **MVC (Model-View-Controller)**.

Website ini bertujuan untuk memberikan pengalaman digital yang modern bagi pelanggan, mulai dari melihat menu, mengenal area café, hingga melakukan reservasi meja secara online.

> **Tagline**
>
> **Work. Connect. Unwind.**

---

# 🛠️ BAGIAN 1 : Persiapan Software

Sebelum menjalankan project ini, pastikan software berikut sudah terinstall.

## 1. Git

Digunakan untuk clone, pull, dan push project ke GitHub.

Download:

https://git-scm.com/download/win

---

## 2. Java JDK 17 atau 21

Disarankan menggunakan Java 17 LTS.

Download:

https://adoptium.net/

---

## 3. Apache NetBeans

IDE utama untuk pengembangan project.

Download:

https://netbeans.apache.org/download/index.html

---

## 4. Apache Tomcat 10.1+

Server untuk menjalankan aplikasi Jakarta EE.

Download:

https://tomcat.apache.org/

---

## 5. XAMPP

Digunakan sebagai server MySQL.

Download:

https://www.apachefriends.org/

---

# 🚀 BAGIAN 2 : Clone Project

Clone repository

```bash
git clone https://github.com/USERNAME/BBSpace.git
```

Masuk ke folder project

```bash
cd BBSpace
```

---

# 🌿 BAGIAN 3 : Git Workflow

## Mengambil update terbaru

```bash
git checkout main
git pull origin main
```

---

## Membuat Branch Baru

Misalnya ingin membuat fitur reservation.

```bash
git checkout -b fitur-reservation
```

---

## Commit

```bash
git add .
git commit -m "Menambahkan halaman reservation"
```

---

## Push

```bash
git push origin fitur-reservation
```

---

## Pull Request

Masuk ke GitHub

Klik

```
Compare & Pull Request
```

Kemudian Merge ke branch **main**.

---

# 📁 BAGIAN 4 : Struktur Project

```
BBSpace
│
├── src
│
│   ├── controller
│   │      HomeServlet.java
│   │      MenuServlet.java
│   │      ReservationServlet.java
│   │
│   ├── model
│   │      Menu.java
│   │      Reservation.java
│   │
│   ├── dao
│   │      MenuDAO.java
│   │      ReservationDAO.java
│   │
│   ├── database
│   │      DBConnection.java
│   │
│   └── utils
│
├── web
│
│   ├── css
│   ├── js
│   ├── images
│   ├── components
│   │
│   ├── index.jsp
│   ├── menu.jsp
│   ├── reservation.jsp
│   ├── contact.jsp
│   └── about.jsp
│
└── pom.xml
```

---

# 🗄️ BAGIAN 5 : Database

Konfigurasi database

| Property | Value |
|----------|-------|
| Host | localhost |
| Port | 3306 |
| Database | bbspace |
| Username | root |
| Password | (kosong) |

---

## Membuat Database

Masuk ke phpMyAdmin

Buat database

```
bbspace
```

---

## Import Database

Import file

```
database/bbspace.sql
```

---

# 💻 BAGIAN 6 : Menjalankan Project

## Menggunakan NetBeans

1. Open Project
2. Pilih folder BBSpace
3. Klik Clean and Build
4. Klik Run

Browser akan membuka

```
http://localhost:8080/BBSpace
```

---

# 🎨 BAGIAN 7 : Konsep Website

Website terdiri dari beberapa halaman.

## Home

Landing page utama.

---

## Menu

Menampilkan seluruh menu makanan dan minuman.

---

## Our Space

Menampilkan tiga area utama.

- Work Zone
- Connect Zone
- Unwind Zone

---

## Reservation

Pelanggan dapat melakukan reservasi meja.

---

## Contact

Berisi

- Google Maps
- WhatsApp
- Instagram
- TikTok

---

# 🎨 BAGIAN 8 : Design System

## Color Palette

| Warna | Hex |
|--------|------|
| Butter Yellow | #F9D976 |
| Soft Orange | #FFB86B |
| Soft Pink | #FFB7C5 |
| White Cream | #FFFDF8 |
| Dark Brown | #5A4032 |

---

## Font

Heading

```
Playfair Display
```

Body

```
Poppins
```

---

# ⚙️ BAGIAN 9 : Teknologi

Frontend

- HTML5
- CSS3
- JavaScript
- JSP

Backend

- Jakarta Servlet
- JDBC

Database

- MySQL

Server

- Apache Tomcat

IDE

- Apache NetBeans

---

# 📌 BAGIAN 10 : Roadmap

- [x] Branding
- [x] Logo
- [x] UI Design
- [ ] Homepage
- [ ] Menu
- [ ] Reservation
- [ ] Database
- [ ] Authentication
- [ ] Admin Dashboard
- [ ] Deployment

---

# 📄 License

Project ini dibuat untuk kebutuhan pembelajaran, pengembangan portfolio, dan implementasi website café modern.

© 2026 B&B Space. All Rights Reserved.
