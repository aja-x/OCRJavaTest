-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Apr 2019 pada 04.29
-- Versi server: 10.1.36-MariaDB
-- Versi PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pl_project2_jpa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_image`
--

CREATE TABLE `tb_image` (
  `id` int(11) NOT NULL,
  `user_username` varchar(12) NOT NULL,
  `name` varchar(255) NOT NULL,
  `path` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_image`
--

INSERT INTO `tb_image` (`id`, `user_username`, `name`, `path`) VALUES
(3, 'daegal', 'asdasd.png', 'E:\\Foto\\Wallpaper\\asdasd.png');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_result`
--

CREATE TABLE `tb_result` (
  `id` int(11) NOT NULL,
  `image_id` int(11) NOT NULL,
  `text` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_result`
--

INSERT INTO `tb_result` (`id`, `image_id`, `text`) VALUES
(1, 3, 'Kau tidak perlu merubah dirimu, rubahlah cara\nberpikirmu. Kau harus tetap menjadi dirimu\nsendiri.\n\n-Kuuhaku\n\n');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `username` varchar(12) NOT NULL,
  `password` varchar(64) NOT NULL,
  `name` varchar(255) NOT NULL,
  `level` varchar(32) NOT NULL,
  `foto` text NOT NULL,
  `alamat` text NOT NULL,
  `nohp` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`username`, `password`, `name`, `level`, `foto`, `alamat`, `nohp`) VALUES
('daegal', '123456', 'Daegal Prayoga', 'admin', 'E:\\Foto\\Close Up\\IMG_6223.JPG', 'Keputih', '081123456789'),
('ubuntu', 'ubuntu', 'ubuntu', 'admin', 'E:\\Foto\\ocr\\profile.png', 'Magetan', '089987654321');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_image`
--
ALTER TABLE `tb_image`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_username` (`user_username`),
  ADD KEY `user_username_2` (`user_username`);

--
-- Indeks untuk tabel `tb_result`
--
ALTER TABLE `tb_result`
  ADD PRIMARY KEY (`id`),
  ADD KEY `image_id` (`image_id`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`username`),
  ADD KEY `nohp` (`nohp`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_image`
--
ALTER TABLE `tb_image`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `tb_result`
--
ALTER TABLE `tb_result`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_image`
--
ALTER TABLE `tb_image`
  ADD CONSTRAINT `tb_image_ibfk_1` FOREIGN KEY (`user_username`) REFERENCES `tb_user` (`username`);

--
-- Ketidakleluasaan untuk tabel `tb_result`
--
ALTER TABLE `tb_result`
  ADD CONSTRAINT `tb_result_ibfk_1` FOREIGN KEY (`image_id`) REFERENCES `tb_image` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
