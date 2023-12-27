$(document).ready(function () {
    function validateNgaySuDung() {

        let ngaySuDung = $("#compositeKeySuDungDichVu\\.ngaySuDung").val();

        if (ngaySuDung === "") {
            $("#compositeKeySuDungDichVu\\.ngaySuDung").addClass("is-invalid")
            $("#errorNgaySuDung").text("* Không được để trống!")
            return false;
        }
        $("#compositeKeySuDungDichVu\\.ngaySuDung").removeClass("is-invalid")
        $("#errorNgaySuDung").text("")
        return true;
    }
    
    function validateGioSuDung() {

        let gioSuDung = $("#compositeKeySuDungDichVu\\.gioSuDung").val();

        if (gioSuDung === "") {
            $("#compositeKeySuDungDichVu\\.gioSuDung").addClass("is-invalid")
            $("#errorGioSuDung").text("* Không được để trống!")
            return false;
        }
        $("#compositeKeySuDungDichVu\\.gioSuDung").removeClass("is-invalid")
        $("#errorGioSuDung").text("")
        return true;
    }


    $(document).on("submit", "#formSDDV", function (event) {
        event.preventDefault();
        
        console.log("sddv den here");
        
        if (!validateNgaySuDung() | !validateGioSuDung()) {
            return;
        }

        this.submit();
    });
})