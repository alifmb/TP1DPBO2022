CREATE DATABASE pos;
use pos;

CREATE TABLE buku (
  img_buku int(20) PRIMARY KEY,
  penerbit_buku varchar(200) DEFAULT NULL,
  author_buku varchar(200) DEFAULT NULL,
  jumlah_buku int(200) DEFAULT NULL,	
  desc_buku varchar(200) DEFAULT NULL,
);
