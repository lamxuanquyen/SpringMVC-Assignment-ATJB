$(document).ready(function () {
    function validateNgayBatDauSuDung() {

        let ngayBatDauSuDung = $("#compositeKeySuDungMay\\.ngayBatDauSuDung").val();

        if (ngayBatDauSuDung === "") {
            $("#compositeKeySuDungMay\\.ngayBatDauSuDung").addClass("is-invalid")
            $("#errorNgayBatDauSuDung").text("* Không được để trống!")
            return false;
        }
        $("#compositeKeySuDungMay\\.ngayBatDauSuDung").removeClass("is-invalid")
        $("#errorNgayBatDauSuDung").text("")
        return true;
    }
    
    function validateGioBatDauSuDung() {

        let gioBatDauSuDung = $("#compositeKeySuDungMay\\.gioBatDauSuDung").val();

        if (gioBatDauSuDung === "") {
            $("#compositeKeySuDungMay\\.gioBatDauSuDung").addClass("is-invalid")
            $("#errorGioBatDauSuDung").text("* Không được để trống!")
            return false;
        }
        $("#compositeKeySuDungMay\\.gioBatDauSuDung").removeClass("is-invalid")
        $("#errorGioBatDauSuDung").text("")
        return true;
    }


    $(document).on("submit", "#formSDM", function (event) {
        event.preventDefault();
        
        console.log("sdm den here");
        
        if (!validateNgayBatDauSuDung() | !validateGioBatDauSuDung()) {
            return;
        }

        this.submit();
    });
})