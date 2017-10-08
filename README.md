# latihan-2

Latihan Spring Web MVC

Buatlah aplikasi Pelayanan Pembayaran Listrik (PLN) yang terdiri dari modul

## Modul Sistem PLN

- Setiap pelanggan bisa memiliki produk (Token) yang lebih dari satu, artinya satu pelanggan mungkin memiliki lebih dari 1 rumah.
- Token listrik terdiri dari 

| kode 	| nama produk   | harga    	|
| :--  	| :--		    | :--      	|
| 20   	| Rp. 20.000	| 21.000   	|
| 50	| Rp. 50.000	| 51.000	|
| 100	| Rp. 100.000	| 101.500	|
| 200	| Rp. 200.000	| 201.500	|
| 500	| Rp. 500.000	| 502.000	|
| 1000	| Rp. 1.000.000	| 1.005.000	|

- Transaksi pembelian token harus dicatat
- Transaksi sisa saldo harus terdeteksi, artinya contohnya sisa saldo `Rp.10.000` ketika membeli token sebesar `Rp.100.000` maka saldonya sekarang harus bertambah menjadi `Rp.110.000`.
- Pelanggan bisa melihat detail transaksi pembelian token sesuai nomor-pelanggan

## Modul Security

### Role USER

- Setiap pelanggan hanya di perbolehkan memiliki 1 user dan di tetapkan sebagai role `ROLE_USER`
- Pelanggan bisa melihat daftar transaksi yang dilakukan oleh user tersebut, tidak boleh melihat transaksi yang dilakukan oleh user selain dia


### Role ADMIN

- Sediakan seorang user sebagai admin untuk me-menage data master seperti 
	- Mengupdate harga token
	- Aktifasi data pelanggan
	
## Cara Mengerjakan 

- Fork repository ini
- Buat database dengan nama `pln_username` contohnya `pln_dimmaryanto93` dengan menggunakan username / role `bootcamp_2`
- Jika setelah selesai push ke github repository masing-masing.
- Code akan di review. jika hasilnya memuaskan akan dimasukan ke contributor repository `tabledatadotcom`
- Backup Database dimasukan ke dalam repository simpan di file `src/main/resources/db/backup/`

